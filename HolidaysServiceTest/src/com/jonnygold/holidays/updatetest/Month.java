package com.jonnygold.holidays.updatetest;


public enum Month{
	JANUARY("������", "������", 31),
	FEBRARY("�������", "�������", 29),
	MARCH("����", "�����", 31),
	APRIL("������", "������", 30),
	MAY("���", "���", 31),
	JUNE("����", "����", 30),
	JULY("����", "����", 31),
	AUGUST("������", "�������", 31),
	SEPTEMBER("��������", "��������", 30),
	OCTOBER("�������", "�������", 31),
	NOVEMBER("������", "������", 30),
	DECEMBER("�������", "�������", 31);
	
	private String name;
	private String genitive;
	private int dayCount;
	
	private Month(String name, String genitive, int dayCount){
		this.name = name;
		this.genitive = genitive;
		this.dayCount = dayCount;
	}
	
	public String[] getDays(){
		String[] days = new String[dayCount];
		for(int i=0; i<dayCount; i++){
			days[i] = String.valueOf(i+1);
		}
		return days;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public String getGenitive() {
		return genitive;
	}
	
}