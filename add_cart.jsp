<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="Header.jsp" %>
     <%@ page import="java.util.*"%>
     <%@ page import="cart.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<div id="breadcrumbs">
		<div class="container">
			<ul>
				<li><a href="index.jsp">HOME</a></li>
				<li><a href="Product_page.jsp">OUR PRODUCTS</a></li>
				<li>CART</li>
			</ul>
		</div>
		<!-- / container -->
	</div>
	<!-- / body -->
	<% ArrayList<CartPOJO> arl=(ArrayList<CartPOJO>)session.getAttribute("cart_record");
		if (arl==null)
		{
		%><center>
		<h1><strong>CART IS EMPTY</strong></h1>
		</center>
		<%} 
		else
		{
		%>
		<div id="body">
			<div class="container">
				<div id="content" class="full">
					<div class="cart-table">
						<table>
							<tr>
								<th class="items">ITEMS</th>
								<th class="name">NAME</th>
								<th class="price">PRICE</th>
								<th class="qnt">QUANTITY</th>
								<th class="total">TOTAL</th>
								<th class="delete"></th>
								
							</tr>
							<% int i=0;
								double gtp=0;
								for (CartPOJO itm:arl)
								{
							%>
							<tr>
								<td class="items">
									<div class="image">
										<img src="admin/<%=itm.getImage() %>" alt="" height="50px" width="50px">
									</div>
								</td>
								<td class="name"><%=itm.getPr_nm() %></td>
								<td class="price"><%=itm.getPr_prc()%></td>
								<td class="qnt"><%=itm.getQnty()%></td>
								<td class="total"><%= itm.gettotalPrice() %>
								<% gtp=gtp+itm.gettotalPrice();
									session.setAttribute("GrandTotal",gtp);%></td>
								
								<td><a href="remove?index=<%=i++ %>" class="btn-grey">REMOVE</a></td>
								</tr>
								<%} %>
								
							</table>
							</div>
							<div class="total-count">
							<h3>Total  pay: <strong><%out.print("<h1>");
								out.print(gtp+500);%></strong></h3>
							
					<a href="Proceed.jsp" class="btn-grey">PROCEED TO PAY</a>
				</div>
		
							</div>
							</div>
							</div>
							
							<%} %>
</body>
</html><br><br><br>
<%@ include file="Footer.jsp"%>