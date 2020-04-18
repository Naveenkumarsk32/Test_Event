package com.erroredotech.event.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class Connection_Provider 
{
	public static Connection getconnection()
	{
		Connection con = null;
		
			try {
				Driver driverref =	new Driver();
				DriverManager.registerDriver(driverref);
			con = DriverManager.getConnection("jdbc:mysql://i2cpbxbi4neiupid.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/a3j1ywyljkdzad4r?user=wnhui73nfjp8i61j&password=iigo4r1t5ggpyhgc");
			
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			
			
		return con;
	}

}
