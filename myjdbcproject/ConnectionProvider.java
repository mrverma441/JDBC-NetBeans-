/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    
    private static Connection con;
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		if(con==null)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection
			String url="jdbc:mysql://localhost:3306/myjdbc";
			String username="root";
			String password="7534050774";
			Connection con=DriverManager.getConnection(url, username, password);

		}
		return con;
	}

    
}

