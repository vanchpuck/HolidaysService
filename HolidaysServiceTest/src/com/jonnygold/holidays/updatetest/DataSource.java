package com.jonnygold.holidays.updatetest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

	private static final String URL = "jdbc:postgresql://holidays.ccacq9imxn4n.eu-west-1.rds.amazonaws.com:5432/holidays";
	
	private static final String USER = "jonnygold";
	
	private static final String PASSWORD = "GoldenAxe";
			
	private final static String HOLIDAYS_QUERY = 
			"select * from get_holidays(?)"
	;
	
	private final static String FREE_HOLIDAYS_QUERY = 
			"select * from get_free_holidays(?)"
	;
	
	private Connection connection;
	
	public void connect() throws SQLException{
		System.out.println("Подключение...");
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
        connection.setAutoCommit(true);
        
        System.out.println("Подключено.");
	}
	
	public void disconnect() throws SQLException{
        System.out.println("Отключение...");
        connection.close();
        System.out.println("Отключено.");
    }
	
	public List<HolidayRaw> getAllHolidays(int countryId) throws SQLException{
		return getHolidays(HOLIDAYS_QUERY, countryId);
	}
	
	public List<HolidayRaw> getFreeHolidays(int countryId) throws SQLException{
		return getHolidays(FREE_HOLIDAYS_QUERY, countryId);
	}
	
	public List<HolidayRaw> getHolidays(String query, int countryId) throws SQLException{
		List<HolidayRaw> holidays = new ArrayList<HolidayRaw>();
		
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setInt(1, countryId);
		ResultSet rs = stmt.executeQuery();
		
		for(HolidayRaw holiday = null; rs.next(); ){
			HolidayDate.Builder builder = new HolidayDate.Builder();
			HolidayDate date = builder
					.setActualDay(getIntOrNull(rs.getString("h_day")) )
					.setActualMonth(getIntOrNull(rs.getString("h_month")) )
					.setFloaMonth(getIntOrNull(rs.getString("h_month")) )
					.setOffset(getIntOrNull(rs.getString("fm_offset")) )
					.setWeekDay(getIntOrNull(rs.getString("fm_weekday")) )
					.setYearDay(getIntOrNull(rs.getString("fy_day")))
					.create();
						
			holiday = new HolidayRaw(
					rs.getInt("id_holiday"),
					rs.getString("h_title"), 
					rs.getString("h_date_str"), 
					rs.getInt("id_type"), 
					new Picture(rs.getInt("id_image"), rs.getString("img_desc"), rs.getString("img_vk"), rs.getBytes("img")), 
					rs.getString("h_desc"), 
					countryId, 
					date)
			;
			
			holidays.add(holiday);
		}
				
		return holidays;
	}
	
	private Integer getIntOrNull(String value){
		return value == null ? null : Integer.valueOf(value);
	}
	
}
