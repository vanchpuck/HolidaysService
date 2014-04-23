package com.jonnygold.holidays.updatetest;
import java.util.ArrayList;
import java.util.List;


public class HolidayPack {

	private List<HolidayRaw> holidays;
	
	private int cointryId;
	
	public HolidayPack () {}
	
	public HolidayPack (int countryId){
		this.cointryId = countryId;
		holidays = new ArrayList<HolidayRaw>();
	}
	
	public int getCointryId() {
		return cointryId;
	}
	
	public HolidayRaw[] getHolidays(){
		HolidayRaw[] aray = new HolidayRaw[0];
		return holidays.toArray(aray);
	}
	
	public void addHoliday(HolidayRaw holiday){
		holidays.add(holiday);
	}
	
}
