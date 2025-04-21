package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		Statement stmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/morningbatch","root","992330");
		
			stmt=con.createStatement();
			stmt.execute("create table Employee(id int  primary key,name varchar(20),position varchar(20),salary bigint);");
			
			System.out.println("Table created successfully...!");
			
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
