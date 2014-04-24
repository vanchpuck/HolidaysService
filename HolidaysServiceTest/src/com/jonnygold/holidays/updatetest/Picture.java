package com.jonnygold.holidays.updatetest;


import java.util.Arrays;

public class Picture {

	private int id;
	
	private String title;
	
	private String vkPicture;
	
	private byte[] data;
	
	public Picture(){}
	
	public Picture(int id){
		this.id = id;
		this.title = null;
		this.vkPicture = null;
		this.data = null;
	}
	
	public Picture(int id, String title, String vkPicture, byte[] data){
		this.id = id;
		this.title = title;
		this.vkPicture = vkPicture;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public byte[] getData() {
		return Arrays.copyOf(data, data.length);
	}
	
	public String getVkPicture() {
		return vkPicture;
	}
		
	@Override
	public int hashCode() {
		return (31 * (11 + id));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Picture))
			return false;
		return id == ((Picture)obj).getId();
	}
	
}
