package com.erroredotech.event.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class Registration_Servlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
						throws ServletException, IOException 
	{
		
		 String name=req.getParameter("name");
		 String email=req.getParameter("email");
		 String phon_num=req.getParameter("contact");
		 String password=req.getParameter("password");
		 String confirm_Pass=req.getParameter("confirm_Pass");
		 String place=req.getParameter("place");
		 String state=req.getParameter("state");
		 
		 Registration_Pojo_Class rs = new Registration_Pojo_Class();
		 rs.setName(name);
		 rs.setEmail(email);
		 rs.setphon_num(Long.parseLong(phon_num));
		 rs.setPassword(password);
		 rs.setConfirmpassword(confirm_Pass);
		 rs.setPlace(place);
		 rs.setState(state);
		 
		 
		 
		int res = Database_Storage_Class.insert(rs);
		
		/*if(res!=0)
		 {
			resp.sendRedirect("errorlogin.html."); 
		 }
		 else
		 {
			 resp.getWriter().println("Rgistered first..!"); 
		 }*/
		 
if (res!=0) 
{
	req.getRequestDispatcher("errorlogin.html").forward(req, resp);	
} else {
	resp.getWriter().println("Rgistered first..!"); 
}
	

	}

}
