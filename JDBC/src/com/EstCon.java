package com;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EstCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//Step1 : Load & Register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		
		//Establishing Connection between Java & Database
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		//Step3 : Create Statement object
		Statement statement = connection.createStatement();
		
		//Step4 : Sending & execute the Query
		String sqlslectquery = "Select * From Emp";
		ResultSet resultSet = statement.executeQuery(sqlslectquery);
		
		//Step5 : Process the result form resultset
		while(resultSet.next()) {
			Integer empno = resultSet.getInt(1);
			String ename = resultSet.getString(2);
			Integer deptno = resultSet.getInt(3);
			
			System.out.println(empno + "\t" + ename + "\t" + deptno);
		}
		
		connection.close();
	}

}





//Driver driver = new Driver();
//DriverManager.registerDriver(driver);
//
//String url = "jdbc:mysql://localhost:3306/test";
//String username = "root";
//String password = "root@123";
//Connection connection = DriverManager.getConnection(url, username, password);
//
//Statement statement = connection.createStatement();
//
//String query = "Select * from emp";
//ResultSet resultSet = statement.executeQuery(query);
//
//while(resultSet.next()) {
//	Integer empno = resultSet.getInt(1);
//	String ename = resultSet.getString(2);
//	Integer deptno = resultSet.getInt(3);
//	
//	System.out.println(empno + ename + deptno);
//}
//
//connection.close();

