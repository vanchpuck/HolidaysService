package com.jonnygold.holidays.updatetest;
public class HolidayRaw {

	private int id;
	
	private String title;
	
	private String dateSrt;
	
	private int type;
	
	private Picture picture;
	
	private String description;
	
	private int countryId;
	
	private HolidayDate date;
	
	public HolidayRaw(){}
	
	public HolidayRaw(
			int id,
			String tittle, 
			String dateStr, 
			int type, 
			Picture picture, 
			String description, 
			int countryId,
			HolidayDate date){
		
		this.id = id;
		this.title = tittle;
		this.dateSrt = dateStr;
		this.type = type;
		this.picture = picture;
		this.description = description;
		this.countryId = countryId;
		this.date = date;
	}
	
	public int getId(){
		return id;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getDateString(){
		return dateSrt;
	}
	
	public int getType(){
		return type;
	}
	
	public Picture getPicture(){
		return picture;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getCountryId(){
		return countryId;
	}
	
	public HolidayDate getDate(){
		return date;
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	protected void setTitle(String title) {
		this.title = title;
	}
	
	protected void setDateSrt(String dateSrt) {
		this.dateSrt = dateSrt;
	}
	
	protected void setType(int type) {
		this.type = type;
	}
	
	protected void setPicture(Picture picture) {
		this.picture = picture;
	}
	
	protected void setDescription(String description) {
		this.description = description;
	}
	
	protected void setDate(HolidayDate date) {
		this.date = date;
	}

}
