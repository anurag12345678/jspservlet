package com.org;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
	public static Connection getConnection() throws SQLException,ClassNotFoundException{
		String url="jdbc:mysql://localhost:3306/user";
		String uname="root";
		String pass="adm@123";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= (Connection) DriverManager.getConnection(url,uname,pass);
		return con;
	}
	
}

		
			