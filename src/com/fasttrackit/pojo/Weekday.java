package com.fasttrackit.pojo;

public class Weekday {
	
	private int id;
	private String day;
	
	public Weekday() {
		
	}
	
	public Weekday(int id, String day) {
		
		this.id=id;
		this.day=day;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	
	
	
	
}
