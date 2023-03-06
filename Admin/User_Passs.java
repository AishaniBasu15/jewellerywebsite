package Admin;

import admin_model_pack.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class User_Passs
 */
@WebServlet("/User_Passs")
public class User_Passs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		String user=request.getParameter("user1");
		String pswrd=request.getParameter("pass1");
		HttpSession ses_login=request.getSession();//in servlet page we need to create object of session not required in jsp page
		ses_login.setAttribute("username",user);
		PrintWriter p=response.getWriter();
		//p.print(user);
		//p.print(pswrd);
		boolean b=AdminModel.LoginCheck(user,pswrd);
		if(b)
		{
			
			response.sendRedirect("admin/Dashboard.jsp");
		}
		else
		{
			response.sendRedirect("admin/login.jsp");
		}
		
	}

}
