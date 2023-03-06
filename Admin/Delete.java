package Admin;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
//import projectPOJO.*;
import admin_model_pack.*;
import connection_pack.*;


/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("helo");
		try {
			Connection cn=MyDBConnect.getCon();
			String p_id1=request.getParameter("pr_id");
			boolean del=P_insert.Delete_val(p_id1);
			if(del) {
				pw.print("deleted");
				response.sendRedirect("admin/Product_show.jsp");
			}
			else {
				
					pw.print("not deleted");
					response.sendRedirect("admin/Product_show.jsp");
					
				}
			}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("in exception");
		}
	}

}
