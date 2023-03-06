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

<title>Diana’s jewelry</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
	<link rel="stylesheet" media="all" href="web_temp/css/style.css">
	<!--[if lt IE 9]>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	
<title>Insert title here</title>
</head>
<body>
<br><br>
<div class="container">
	<div id="content">
				<section class="products">
				<% ArrayList<POJO_class> all=P_insert.getval();
					for(POJO_class pc:all){%>
					<article >
						<a href="product.html"><img src="admin/<%=pc.getS_img() %>" alt="" style="height:250px;width:200px"></a>
							<p><%=pc.getS_name()  %><br>
							<%=pc.getS_price() %><br>
							<%=pc.getS_dsc() %></p>		
							 <a href="showDetails.jsp?prd_id=<%= pc.getS_id() %>"  class="btn-add">Show Details</a> 
							
							<%-- --%>
					</article>
						
					
					<%} %>
					</section>
				</div>
				<!-- / content -->
</div>
			
	
		<br><br><br><br>
	<!-- / body -->
<%@ include file="Footer.jsp" %>
</body>
</html>