<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% boolean log_chk;
log_chk=(boolean)session.getAttribute("userInfo");
out.print(log_chk);
//System.out.println((String)session.getAttribute("user_name"));
if(log_chk)
{
	response.sendRedirect("payment.jsp");
	
	
	
	}
	else{
		response.sendRedirect("Login.jsp");
	
	}%>

</body>
</html>