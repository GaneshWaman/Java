package com;

import java.sql.*;

//import com.mysql.cj.jdbc.Driver;

//import com.mysql.cj.jdbc.*;

public class connectMysql {

	public static void main(String[] args) throws SQLException {
		System.out.println("----------");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		System.out.println("_______Driver loaded___________");
		
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		
//		Driver driver =new Driver();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306:test";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		
		String query = "Select * from  emp";
		Statement stat = con.createStatement();
		ResultSet res = stat.executeQuery(query);
		
		while(res.next()) {
			int empno = res.getInt(1);
			String ename = res.getString(2);
			int dept = res.getInt(3);
			
			System.out.println(empno+ "\t"+ ename +"\t"+ dept);
		}
		stat.close();
	}

}
