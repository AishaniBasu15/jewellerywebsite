package CartController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_pack.MyDBConnect;
import sign_in.Sign_model;
import sign_pojo.POJO_Acct;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		PrintWriter pw = response.getWriter();
		pw.print("hello");
		String ft_name=request.getParameter("f_name");
		String lt_name=request.getParameter("l_name");
		String addr=request.getParameter("addr");
		String cntct=request.getParameter("cnct");
		String u_name=request.getParameter("usr");
		String pass=request.getParameter("psd");
		try {
			Connection cn=MyDBConnect.getCon();
			POJO_Acct po=new POJO_Acct(ft_name,lt_name,addr,cntct,u_name,pass);
			boolean bo2=Sign_model.Insert(po);
			if(bo2)
			{
				pw.print("done");
			}
			else {
				pw.print("not done");
						
			}
		
	}
		catch(Exception e)
		{
			e.printStackTrace();		
		}

}
}
