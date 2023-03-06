package Admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_pack.MyDBConnect;
import projectPOJO.POJO_class;

import java.sql.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import admin_model_pack.P_insert;

import java.util.*;

/**
 * Servlet implementation class Update_val
 */
@WebServlet("/Update_val")
public class Update_val extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_val() {
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
		PrintWriter pw = response.getWriter();
		String prId4="";
		
		String prName4="";
		String date4="";
		String price4="";
		String qnty4="";
		String dsc4="";
		String image_path="" , img1 ="";
		String fname="",sql ;
		try {
			//Connection cn=MyDBConnect.getCon();
			if(ServletFileUpload.isMultipartContent(request))
			{
				try {
					List<FileItem> mul=new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
					System.out.println(mul);
					prId4=mul.get(0).getString();
					prName4=mul.get(1).getString();
					date4=mul.get(2).getString();
					price4=mul.get(3).getString();
					qnty4=mul.get(4).getString();
					dsc4=mul.get(5).getString();
					img1 = mul.get(6).getString();
//					String test = mul.get(7).getString();
//					System.out.println(dsc4);
//					System.out.println(img1);
//					System.out.println(test);
					for (FileItem i:mul)
					{
//						
							if(!i.isFormField())
							{
								File f=new File(i.getName());
								fname=new File(i.getName()).getName();
//								image_path="product_img"+File.separator+fname;
								image_path = "product_img/"+fname;
								pw.print(image_path);
								
								
								i.write(new File("D:\\proj_advjava\\MVC_project\\src\\main\\webapp\\admin\\"+image_path));
								//pw.print("hello6");
								//sql = "update product_table set Product_Name='"+prName4+"',Purchase_Date='"+date4+"',Price='"+price4+"',Quantity='"+qnty4+"',Description='"+dsc4+"' ,Image='"+image_path+"' where Product_Id='"+prId4+"' ";
								POJO_class apj = new POJO_class(prId4,prName4,date4,price4,qnty4,dsc4,image_path);
								boolean b = P_insert.update(apj);
								if(b) {
//									System.out.println("updated with img");
									response.sendRedirect("admin/Product_show.jsp");
									
									
								}
								else {
									
//									System.out.println("in else");
									response.sendRedirect("admin/Product_show.jsp");
								}
							}
							
								
							}
					
				}
				catch(Exception e)
				{
					//pw.print("error");
					//sql="update product_table set Product_Name='"+prName4+"',Purchase_Date='"+date4+"',Price='"+price4+"',Quantity='"+qnty4+"',Description='"+dsc4+"' ,Image='"+img1+"' where Product_Id='"+prId4+"'";
								//System.out.println("hello2");
					POJO_class apj = new POJO_class(prId4,prName4,date4,price4,qnty4,dsc4,img1);
					boolean b = P_insert.update(apj);
					
						if(b) {
							System.out.println("1 row updated");
							response.sendRedirect("admin/Product_show.jsp");
							
						}
						else {
						
							System.out.println("no row updated");
							response.sendRedirect("admin/Product_show.jsp");
						}
					}
						
					
			}
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}

					
				
	
			
			//print sql;
			//sql="update product_table set Product_Name='"+prName4+"',Purchase_Date='"+date4+"',Price='"+price4+"',Quantity='"+qnty4+"',Description='"+dsc4+"' ,Image='"+img1+"' where Product_Id='"+prId4+"'";
//			POJO_class apj = new POJO_class(prId4,prName4,date4,price4,qnty4,dsc4,image_path);
//			boolean b = P_insert.update(apj);
//			System.out.println(sql);
		
			
	


