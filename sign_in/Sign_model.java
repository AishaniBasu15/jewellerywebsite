package sign_in;
import java.sql.Connection;
import java.sql.PreparedStatement;

import connection_pack.MyDBConnect;
import sign_pojo.*;

public class Sign_model {
	public static boolean Insert(POJO_Acct obj)
	{
		System.out.println(obj.getFst_name());
		try {
			Connection cn=MyDBConnect.getCon();
			String sql="insert into signup values(?,?,?,?,?,?)";
			PreparedStatement p=cn.prepareStatement(sql);
			p.setString(1,obj.getFst_name());
			p.setString(2,obj.getLst_name());
			p.setString(3,obj.getAddress());
			p.setString(4,obj.getPhn());
			p.setString(5,obj.getUserNm());
			p.setString(6,obj.getPsrwd());
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
			
	}

