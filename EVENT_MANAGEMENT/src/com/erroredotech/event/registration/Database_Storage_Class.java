package com.erroredotech.event.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class Database_Storage_Class 
{
	public static int insert(Registration_Pojo_Class rs)
	{
	Connection con = null;
	PreparedStatement ps = null;
	int res=0;
	 
	 try {
		 con = Connection_Provider.getconnection();
		 ps = con.prepareStatement(" insert into REGISTRATION(name,email,phone_number,password,confirm_password) " + " values(?,?,?,?,?) ",Statement.RETURN_GENERATED_KEYS );
		 
		
		 ps.setString(1,rs.getName());
		 ps.setString(2,rs.getEmail());
		 ps.setLong(3, rs.getphon_num());
		 ps.setString(4, rs.getPassword());
		 ps.setString(5, rs.getConfirmpassword());
		
		 
		
		 
		res = ps.executeUpdate();
		 
		 
	 	 } catch (SQLException e) {
		 e.printStackTrace();
	 	 }try {
	 		if(con!=null)
			{
				con.close();
			}
			if(ps!=null)
			{
				ps.close();
			}
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	return res;
		
	 
	}

}
