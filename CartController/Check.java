package CartController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sign_in.Login_model;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		String f_nm=request.getParameter("fs_name");
		String l_nm=request.getParameter("ls_name");
		String usr3=request.getParameter("user_id");
		String pass3=request.getParameter("pass1");
		HttpSession ses=request.getSession();
		//ses.setAttribute("nm",f_nm);
		//ses.setAttribute("id",usr3);
		PrintWriter p=response.getWriter();
		p.print(f_nm);
		p.print(usr3);
		boolean bo=Login_model.log_check(usr3, pass3);
		System.out.println(bo);
		if(bo)
		{
			System.out.println("user in table");
			ses.setAttribute("userInfo",bo);
			ses.setAttribute("user_name", f_nm);
//			System.out.println(f_nm);
			System.out.println(ses.getAttribute("user_name"));
			response.sendRedirect("index.jsp");
		}
		else
		{
			System.out.println("signup first");
			response.sendRedirect("Account.jsp");
		}
		
	}

}
