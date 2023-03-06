package sign_in;

import java.sql.*;

import connection_pack.MyDBConnect;

public class Login_model {
	public static boolean log_check(String usr4,String pss4)
	{
		try
		{
			Connection cn=MyDBConnect.getCon();
			String sql="select * from signup where UserName=? and Password=?";
			PreparedStatement p=cn.prepareStatement(sql);
			p.setString(1,usr4);
			p.setString(2,pss4);
			ResultSet rs=p.executeQuery();
			{
				if(rs.next())
				{
					System.out.println("user found");
					return true;
				}
				else
				{
					System.out.println("user not found");
					return false;
				}
			}
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			return false;
			
					
	}
	}
}


