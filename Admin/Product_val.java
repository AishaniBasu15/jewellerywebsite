package Admin;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.*;
import java.util.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import admin_model_pack.*;
import projectPOJO.*;


/**
 * Servlet implementation class Product_val
 */
@WebServlet("/Product_val")
public class Product_val extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product_val() {
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
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		//pw.print("hello");
		//System.out.println("hello");
		//doGet(request, response);
		String id="";
		String name="";
		String date="";
		String prc="";
		String quant="";
		String desc="";
		String img_path="";
		String fname="";
		//pw.print("hello1");
		if (ServletFileUpload.isMultipartContent(request))
		{
			try
			{
				List<FileItem> multiparts=new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				System.out.println(multiparts);
				//pw.print("hello2");
				//System.out.println("hello3");
				
					//System.out.println(multiparts);
				
				for (FileItem i:multiparts)
				{
						if(!i.isFormField())
						{
							File f=new File(i.getName());
							fname=new File(i.getName()).getName();
							//System.out.println("hello2");
					
							img_path="product_img"+File.separator+fname;
							
							
							
							i.write(new File("D:\\proj_advjava\\MVC_project\\src\\main\\webapp\\admin\\"+img_path));
							//pw.print("hello6");
						}
					}
//				System.out.println(fname);
//				
//				System.out.println(img_path);
					System.out.println("hello3");
					id=multiparts.get(0).getString();
					name=multiparts.get(1).getString();
					date=multiparts.get(2).getString();
					prc=multiparts.get(3).getString();
					quant=multiparts.get(4).getString();
					desc=multiparts.get(5).getString();
					System.out.println("id= "+id);
					System.out.println("name= "+name);
					System.out.println("price= "+prc);
					System.out.println("quantity= "+quant);
					System.out.println("description"+desc);
					System.out.println(img_path);
					POJO_class po=new POJO_class(id,name,date,prc,quant,desc,img_path);
					boolean b1=P_insert.Insert(po);
					if(b1)
					{
					
						response.sendRedirect("admin/Dashboard.jsp");
						
					}
					else
					{
						pw.print("not done");
					}
					
				}
			
				catch (Exception e)
				{
					e.printStackTrace();
					
				}
			}
			
		
				
	}

}
