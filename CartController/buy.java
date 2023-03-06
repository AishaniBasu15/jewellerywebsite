package CartController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin_model_pack.*;
import projectPOJO.POJO_class;
import cart.*;

/**
 * Servlet implementation class buy
 */
@WebServlet("/buy")
public class buy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buy() {
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
		String prd1_id=request.getParameter("sid");
		String quant=request.getParameter("qnty1");
		PrintWriter p=response.getWriter();
		POJO_class pc=P_insert.getprod(prd1_id);
//		p.print(pc);
		HttpSession hs=request.getSession();
		CartPOJO cp=new CartPOJO(pc.getS_img(),quant,prd1_id,pc.getS_name(),pc.getS_price());
		if(hs.getAttribute("cart_record")==null)
		{
			ArrayList<CartPOJO> cart_itm=new ArrayList<CartPOJO>();
			cart_itm.add(cp);
			hs.setAttribute("cart_record", cart_itm);
			
		}
		else {
			ArrayList<CartPOJO> cart_itm1=(ArrayList<CartPOJO>)hs.getAttribute("cart_record");
			int f=0;
			for(CartPOJO ob:cart_itm1)
			{
				if(ob.getPr_id().equals(prd1_id))
				{
					int qnt=Integer.parseInt(ob.getQnty())+Integer.parseInt(quant);
//					
					ob.setQnty(""+qnt);
					f=1;
				}
			}
			if(f==0)
			{
				cart_itm1.add(cp);
				hs.setAttribute("cart_record",cart_itm1);
			}
			
//			p.print("test");
		}
		response.sendRedirect("add_cart.jsp");
		
		
		//p.print("hello world");
	}

}
