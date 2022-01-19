package com.timesheet.model;

public class TimeSheet {
	
	
	private int timesheetId;
	private int empId;
	private java.util.Date date ;
	private String activity;
	private String descripition;
	private float hrs;
	private String status ;
	public int getEmpId() {
	return empId;
	}
	public void setEmpId(int empId) {
	this.empId = empId;
	}
	public int getTimesheetId() {
	return timesheetId;
	}
	public void setTimesheetId(int timesheetId) {
	this.timesheetId = timesheetId;
	}
	public java.util.Date getDate() {
	return date;
	}
	public void setDate(java.util.Date date) {
	this.date = date;
	}
	public String getActivity() {
	return activity;
	}
	public void setActivity(String activity) {
	this.activity = activity;
	}
	public String getDescripition() {
	return descripition;
	}
	public void setDescripition(String descripition) {
	this.descripition = descripition;
	}
	public float getHrs() {
	return hrs;
	}
	public void setHrs(float hrs) {
	this.hrs = hrs;
	}
	public String getStatus() {
	return status;
	}
	public void setStatus(String string) {
	this.status = string;
	}
	public boolean setStatus(int i) {
		// TODO Auto-generated method stub
		return false;
	}}




