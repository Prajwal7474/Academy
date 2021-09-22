package com.configuration;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class Mysql_Configuration {
	

		static final String URL="jdbc:mysql://localhost:8581/academy";
		static final String USER="root";
		static final String PASS="root";
		
		public  static Connection getConnection() throws SQLException
		{
			Connection connection=null;
			connection =(Connection) DriverManager.getConnection(URL,USER,PASS);
			return connection;
		}


	}
