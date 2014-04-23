package com.jonnygold.holidays.updatetest;

import java.sql.SQLException;

public class HolidaysService {

	public HolidayRaw[] getHolidays(int countryId) throws SQLException{
		DataSource ds = new DataSource();
		ds.connect();
		
		HolidayRaw[] holidays = new HolidayRaw[0];
		holidays = ds.getAllHolidays(countryId).toArray(holidays);
		
		ds.disconnect();
		
		return holidays;
	}
	
	public HolidayRaw[] getFreeHolidays(int countryId) throws SQLException{
		DataSource ds = new DataSource();
		ds.connect();
		
		HolidayRaw[] holidays = new HolidayRaw[0];
		holidays = ds.getFreeHolidays(countryId).toArray(holidays);
		
		ds.disconnect();
		
		return holidays;
	}
	
}
