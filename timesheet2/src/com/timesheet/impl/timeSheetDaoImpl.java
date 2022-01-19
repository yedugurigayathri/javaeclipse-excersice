package com.timesheet.impl;

import com.timesheet.timeSheetDao;


	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	
	import com.timesheet.model.TimeSheet;

	public class timeSheetDaoImpl implements timeSheetDao{
		
		@Override
		public boolean insertTimeSheet(TimeSheet timeSheet) {
			Connection con = connectDatabase();
			int rows=0;
			boolean flag = false;
			try {
				PreparedStatement ps = con.prepareStatement("insert into timesheet (empid, date, activity, descripition, hrs, status) values(?,?,?,?,?,?)");
				ps.setInt(1, timeSheet.getEmpId());
				ps.setDate(2, (java.sql.Date)timeSheet.getDate());
				ps.setString(3, timeSheet.getActivity());
				ps.setString(4,  timeSheet.getDescripition());
				ps.setFloat(5, timeSheet.getHrs());
				ps.setString(6, timeSheet.getStatus());
				rows = ps.executeUpdate();
				if (rows > 0) flag = true;
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return flag;
		}

		@Override
		public Connection connectDatabase() {
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/database1","root","Gayathre@123");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;

		}

		@Override
		public List<TimeSheet> getAllTimeSheet() {
			// TODO Auto-generated method stub
			

			Connection con = connectDatabase();
			List<TimeSheet> list= new ArrayList<TimeSheet>();
			
			try {
				PreparedStatement ps = con.prepareStatement("select * from timesheet");
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					TimeSheet ts = new TimeSheet();
					ts.setEmpId(rs.getInt("id"));
					ts.setEmpId(rs.getInt("empid"));
					ts.setDate(rs.getDate("date"));
					ts.setActivity(rs.getString("activity"));
					list.add(ts);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}

		public boolean ChangeStatus(int id) {
			Connection con = connectDatabase();
			int rows=0;
			boolean flag = false;
			try {
			PreparedStatement ps = con.prepareStatement(" update timesheet SET status ='Approved' WHERE empid=5000");

			rows = ps.executeUpdate();
			if (rows > 0) flag = true;


			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			finally {
			try {
			con.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
			return flag;
			// TODO Auto-generated method stub
			
		}

		public boolean getTimeSheetDetails(int id) {
			Connection con = connectDatabase();
			int rows=0;
			boolean flag = false;
			try {
			PreparedStatement ps = con.prepareStatement(" update timesheet SET status ='Approved' WHERE empid=5000");

			rows = ps.executeUpdate();
			if (rows > 0) flag = true;


			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			finally {
			try {
			con.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
			return flag;
			// TODO Auto-generated method stub
		
		}}
