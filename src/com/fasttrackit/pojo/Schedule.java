package com.fasttrackit.pojo;

import java.util.ArrayList;

public class Schedule {

	private int scheduleId;
	private Weekday weekday;
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public Schedule() {

	}

	public Schedule(int scheduleId, Weekday weekdayId, ArrayList<Employee> employees) {
		super();
		this.scheduleId = scheduleId;
		this.weekday = weekdayId;
		this.employees = employees;
	}

	public int getId() {
		return scheduleId;
	}

	public void setId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Weekday getWeekday() {
		return weekday;
	}

	public void setWeekday(Weekday weekday) {
		this.weekday = weekday;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

}