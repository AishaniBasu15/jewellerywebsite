<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ include file="Header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="main-panel">        
        <div class="content-wrapper">
          <div class="row">
            <div class="col-md-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
<form class="forms-sample" action="Check" method="post">
					<div class="form-group">
                      <label for="FirstName">First Name</label>
                      <input type="text" class="form-control" id="FirstName" name="fs_name">
                    </div>
                    <div class="form-group">
                      <label for="LastName">Last Name</label>
                      <input type="text" class="form-control" id="LastName" name="ls_name">
                    </div>
                    <div class="form-group">
                      <label for="Username1">Username</label>
                      <input type="text" class="form-control" id="Username1" name="user_id">
                    </div>
                    <div class="form-group">
                      <label for="Password1">Password</label>
                      <input type="password" class="form-control" id="Password1" name="pass1">
                    </div>
 <button type="submit" class="btn btn-primary me-2">Submit</button>
                    <button class="btn btn-light">Cancel</button>
                  </form>
                  </div>
              </div>
            </div>
            </div>
            </div>
</body>
</html>
<%@ include file="Footer.jsp"%>