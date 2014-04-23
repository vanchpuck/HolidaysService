package com.jonnygold.holidays.updatetest;


public enum WeekDay {
	SUNDAY("�����������"),
	MONDAY("�����������"),
	TUESDAY("�������"),
	WEDNESDAY("�����"),
	THURSDAY("�������"),
	FRIDAY("�������"),
	SATURDAY("�������");
	
	private String title;
	
	private WeekDay(String title){
		this.title = title;
	}
	
	@Override
	public String toString() {
		return this.title;
	}
	
}
