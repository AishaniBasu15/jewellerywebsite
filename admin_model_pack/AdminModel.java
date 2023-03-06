package admin_model_pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection_pack.MyDBConnect;

public class AdminModel {

	
		public static boolean LoginCheck(String u_nm,String pass)
		{
			try
			{
				Connection cn=MyDBConnect.getCon();
				String sql="select * from admin where USERNAME=? and PASSWORD=?";
				PreparedStatement ps=cn.prepareStatement(sql);
				ps.setString(1, u_nm);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				{
					if(rs.next())
					{
						//System.out.println("in admin model if");
						return true;
					}
					else
					{
						//System.out.println("in admin model else");
						return false;
					}
				}
			}
			catch(Exception e)
			{
				//System.out.println("in exception");
				e.printStackTrace();
				return false;
				
		}
	}

}
