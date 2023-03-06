<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="Header.jsp" %>
    <%@ page import="projectPOJO.*" %>
    <%@ page import="admin_model_pack.*" %>
    <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String sid=request.getParameter("prd_id");
	out.print(sid);%>
	<div id="breadcrumbs">
		<div class="container">
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li>Product page</li>
			</ul>
		</div>
		<!-- / container -->
	</div>
<div id="body">
		<div class="container">
			<div id="content" class="full">
				<div class="product">
					<div class="image">
					<% POJO_class pc1=P_insert.getprod(sid);%>
					
						<img src="admin/<%=pc1.getS_img()%>"alt="admin/<%=pc1.getS_img()%>" style="height:600px;width:650px">
					</div>
					<div class="details">
					<form action="buy" method="post">
						
						<h1><%=pc1.getS_name()%></h1><br><br>
						<h3>Rs <%=pc1.getS_price() %></h3><br><br><br>
						<div class="entry">
							<p><%=pc1.getS_dsc() %></p><br><br>
							
							</div>
						
							Quantity
							<select class="form-control" name="qnty1">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							</select><br><br><br>
							
							
						<input type="hidden" value="<%=pc1.getS_id() %>" name="sid">	
							</div>
							<button type="submit" class="btn-grey">ADD TO CART</button>
							</form>
							</div>
							</div>
							</div>
							</div>
							<br><br><br><br><br>
						
							

</body>
</html>
<%@ include file="Footer.jsp" %>