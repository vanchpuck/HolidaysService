package com.jonnygold.holidays.updatetest;


public class HolidayDate {

	public static class Builder{
		
		private HolidayDate date = new HolidayDate();
		
		public Builder setActualMonth(Integer month){
			date.setActualMonth(month);
			return this;
		}
		
		public Builder setActualDay(Integer day){
			date.setActualDay(day);
			return this;
		}
		
		public Builder setFloaMonth(Integer month){
			date.setFloatMonth(month);
			return this;
		}
		
		public Builder setWeekDay(Integer weekDay){
			date.setWeekDay(weekDay);
			return this;
		}
		
		public Builder setOffset(Integer offset){
			date.setOffset(offset);
			return this;
		}
		
		public Builder setYearDay(Integer day){
			date.setYearDay(day);
			return this;
		}
		
		public HolidayDate create(){
			return date;
		}
	}
	
	private Integer actualMonth;
	private Integer actualDay;
	
	private Integer floatMonth;
	private Integer weekDay;
	private Integer offset;
	
	private Integer yearDay;
	
	public HolidayDate(){}
	
	public void setActualMonth(Integer month){
		if(month == null)
			return;
		if(month > 11 || month < 0){
			throw new IllegalStateException("Недопустимое значение месяца.");
		}
		actualMonth = month;
	}
	
	public Integer getActualMonth(){
		return actualMonth;
	}
	
	public void setActualDay(Integer day){
		if(day == null)
			return;
		if(day > 31 || day < 0){
			throw new IllegalStateException("Недопустимое значение дня.");
		}
		actualDay = day;
	}
	
	public Integer getActualDay(){
		return actualDay;
	}
	
	public Integer getFloatMonth(){
		return floatMonth;
	}
	
	public void setFloatMonth(Integer floatMonth){
		if(floatMonth == null)
			return;
		if(floatMonth > 11 || floatMonth < 0){
			throw new IllegalStateException("Недопустимое значение месяца.");
		}
		this.floatMonth = floatMonth;
	}
	
	public Integer getWeekDay(){
		return weekDay;
	}
	
	public void setWeekDay(Integer weekDay){
		if(weekDay == null)
			return;
		this.weekDay = weekDay;
	}
	
	public Integer getOffset(){
		return offset;
	}
	
	public void setOffset(Integer offset){
		if(offset == null)
			return;
		this.offset = offset;
	}
	
	public void setYearDay(Integer day){
		if(day == null)
			return;
		if(day > 366 || day < 0){
			throw new IllegalStateException("В году не может быть больше 366 дней.");
		}
		yearDay = day;
	}
	
	public Integer getYearDay(){
		return yearDay;
	}
	
	public boolean isStable(){
		if(actualDay == null || actualMonth == null){
			return false;
		}
		return true;
	}
	
	public boolean isMonthFloat(){
		if(floatMonth == null || offset == null || weekDay == null){
			return false;
		}
		return true;
	}
	
	public boolean isYearFloat(){
		if(yearDay == null){
			return false;
		}
		return true;
	}
	
}

