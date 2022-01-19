package com.timesheet;

import java.sql.Connection;
import java.util.List;

import com.timesheet.model.TimeSheet;

public interface timeSheetDao {

	public boolean insertTimeSheet(TimeSheet timeSheet);
	public  Connection connectDatabase();
	public List<TimeSheet> getAllTimeSheet();
	
}



