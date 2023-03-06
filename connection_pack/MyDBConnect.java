package connection_pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDBConnect {
	public static Connection getCon()throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_project","root","");
		return con;
		
	}

}
