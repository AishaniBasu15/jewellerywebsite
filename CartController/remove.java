package CartController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class remove
 */
@WebServlet("/remove")
public class remove extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public remove() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		int index=Integer.parseInt(request.getParameter("index"));
		HttpSession sess=request.getSession();
		ArrayList<cart.CartPOJO/*or CartPOJO*/> al2=(ArrayList<cart.CartPOJO>)sess.getAttribute("cart_record");
		if(al2.size()==1)
		{
			al2=null;
		}
		else
		{
			al2.remove(index);
		}
		sess.setAttribute("cart_record",al2);
		response.sendRedirect("add_cart.jsp");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
