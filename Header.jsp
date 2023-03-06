<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
    <%@ page import="java.util.*" %>
    <%@ page import="cart.*" %>
    <%@ page import="sign_pojo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

	<title>Diana’s jewelry</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
	<link rel="stylesheet" media="all" href="web_temp/css/style.css">
</head>
<body>

	<header id="header">
		<div class="container">
			<a href="index.jsp" id="logo" title="Diana’s jewelry">Diana’s jewelry</a>
			
			<div class="right-links">
				<ul>
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="Product_page.jsp">OUR PRODUCTS</a></li>
					<li><a href="add_cart.jsp"><span class="ico-products"></span>CART(<%ArrayList<CartPOJO> arl2=(ArrayList<CartPOJO>)session.getAttribute("cart_record");
					if(arl2!=null)
						out.print(arl2.size());
					else
					out.print(0);
					%>)</a></li>
					
					 <% boolean sp;
					 sp = (boolean)session.getAttribute("userInfo");
					 //sp1=(boolean)session.getAttribute("user_name");
					 
					//	 out.print(sp);
					if(sp)
					{%>
					 <li><a href="Signout.jsp"><span class="ico-signout"></span>Sign out</a></li>
					<%}
					else
					{%>
						<li><a href="Account.jsp"><span class="ico-account"></span>Account</a></li>
						<li><a href="Login.jsp"><span class="ico-account"></span>LOG IN</a></li>
					<% }
					%>
				</ul>
			</div>
		</div>
		<!-- / container -->
	</header>
	<!-- / header -->
	


	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script>window.jQuery || document.write("<script src='/web_temp/js/jquery-1.11.1.min.js'>\x3C/script>")</script>
	<script src="web_temp/js/plugins.js"></script>
	<script src="web_temp/js/main.js"></script>
</body>
</html>

