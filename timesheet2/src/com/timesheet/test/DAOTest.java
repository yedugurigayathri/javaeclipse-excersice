package com.timesheet.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.timesheet.timeSheetDao;
import com.timesheet.impl.timeSheetDaoImpl;
import com.timesheet.model.TimeSheet;

class DAOTest<TimeSheetDao> {

	@Test
	void connectDatabaseTest1() {
		timeSheetDao ts = new timeSheetDaoImpl();
		Connection con = ts.connectDatabase();
		assertNotNull(con);
		}
	@Test
void insertTimeSheetTest() {
timeSheetDao ts = new timeSheetDaoImpl();
TimeSheet timeSheet = new TimeSheet();
timeSheet.setEmpId(5000);
long time = System.currentTimeMillis();
timeSheet.setDate(new java.sql.Date(time));
timeSheet.setActivity("Create a connecton method");
timeSheet.setDescripition("Write a method to return connection");
timeSheet.setHrs(1.5F);
timeSheet.setStatus("Submitted");
boolean flag = ts.insertTimeSheet(timeSheet);
assertTrue(flag);
}
	@Test
	void ChangeStatustest() {
		timeSheetDaoImpl ts = new timeSheetDaoImpl();
		boolean flag =  ts.ChangeStatus(131);
		assertTrue(flag);
	}
	@Test
	void getTimeSheetDetails() {
		timeSheetDaoImpl ts = new timeSheetDaoImpl();
		boolean flag =  ts.getTimeSheetDetails(131);
		assertTrue(flag);
	}
	}


