package admin_model_pack;
import projectPOJO.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection_pack.*;
import java.util.*;

public class P_insert {
	public static boolean Insert(POJO_class ob)
	{
		System.out.println(ob.getS_name());
		System.out.println(ob.getS_img());
		try {
			Connection cn=MyDBConnect.getCon();
			String query=("insert into product_table values(?,?,?,?,?,?,?)");
			PreparedStatement p=cn.prepareStatement(query);
			p.setString(1,ob.getS_id());
			p.setString(2,ob.getS_name());
			p.setString(3,ob.getS_date());
			p.setString(4,ob.getS_price());
			p.setString(5,ob.getS_qnty());
			p.setString(6,ob.getS_dsc());
			p.setString(7,ob.getS_img());
			int b=p.executeUpdate();
			if( b>0)
			{
				System.out.println(b+"row inserted");
				return true;
			}
			else
			{
				System.out.println("no row inserted");
				return false;
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	public static ArrayList<POJO_class> getval()
		{
			ArrayList<POJO_class>list=new ArrayList<POJO_class>();
			try {
				Connection cn=MyDBConnect.getCon();
				PreparedStatement ps=cn.prepareStatement("select * from product_table");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					POJO_class ob= new POJO_class(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
					list.add(ob);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("in exception");
			}
			return list;
		}
	public static boolean Delete_val(String p_id1)
	{
		try {
			Connection cn=MyDBConnect.getCon();
			String sql = "delete from product_table where Product_Id='"+p_id1+"' ";
			PreparedStatement ps=cn.prepareStatement(sql);
//			ps.setString(1,p_id1);
			System.out.println(sql);
			int b=ps.executeUpdate();
			if(b>0)
			{
				System.out.println("one row deleted");
				return true;
			}
			else
			{
				System.out.println("no row deleted");
				return false;
			}
			
			}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("in exception");
			return false;
		}
	}
	public static boolean update(POJO_class up)
	{
		try
		{
			Connection cn=MyDBConnect.getCon();
			String sql="update product_table set Product_Name='"+up.getS_name()+"',Purchase_Date='"+up.getS_date()+"',Price='"+up.getS_price()+"',Quantity='"+up.getS_qnty()+"',Description='"+up.getS_dsc()+"' ,Image='"+up.getS_img()+"' where Product_Id='"+up.getS_id()+"' ";
			System.out.println(sql);
			PreparedStatement p=cn.prepareStatement(sql);
			int b =p.executeUpdate();
			if(b>0)
			{
				System.out.println(b+" row is updated");
				return true;
			}
			else
			{
				System.out.println("no row updated!!");	
				return false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("in exception");
		}
		return false;
	}
		public static POJO_class getprod(String prod_id)
		{
			POJO_class pd=null;
			try {
				Connection cn=MyDBConnect.getCon();
				String sql="Select * from product_Table where Product_Id='"+prod_id+"'";
				System.out.println(sql);
				PreparedStatement pr=cn.prepareStatement(sql);
//				pr.setString(1, prod_id);
				ResultSet res=pr.executeQuery();
				if(res.next())
				{
					pd=new POJO_class(prod_id,res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
					//return pd;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("in exception");
			}
			return pd;
		
			
		
	}
}


