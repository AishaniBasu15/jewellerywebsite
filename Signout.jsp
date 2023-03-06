<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
session.removeAttribute("userInfo");
session.setAttribute("userInfo",false);
session.removeAttribute("user_name");
session.setAttribute("user_name",false); 	
response.sendRedirect("index.jsp");
%>
</body>
</html>