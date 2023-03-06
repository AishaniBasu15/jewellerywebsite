<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String s = (String)session.getAttribute("user_name");
//out.print(s);
	double gtp = (double)session.getAttribute("GrandTotal");
	gtp = gtp * 100;
%>
	
	<center>
	<h1>Are you Confirm for Payment !!!!!</h1><br><br>
		<img src="web_temp/confirm.jpg" ><br><br>
		<button id="rzp-button1">Yes Confirm</button>
	</center>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script>
var options = {
    "key": "rzp_test_BZagLDbQEnoikk", // Enter the Key ID generated from the Dashboard
    "amount": <%=gtp %>, // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
    "currency": "INR",
    "name": "<%=s %>",
    "description": "Test Transaction",
    "image": "https://example.com/your_logo",
   // "order_id": "order_9A33XWu170gUtm", //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
    "handler": function (response){
    	console.log(response);
      /*  alert(response.razorpay_payment_id);
        alert(response.razorpay_order_id);
        alert(response.razorpay_signature)*/
    },
    "prefill": {
        "name": "Hati Kumar",
        "email": "gaurav.kumar@example.com",
        "contact": "9999999999"
    },
    "notes": {
        "address": "Razorpay Corporate Office"
    },
    "theme": {
        "color": "#3399cc"
    }
};
var rzp1 = new Razorpay(options);
rzp1.on('payment.failed', function (response){
        alert(response.error.code);
        alert(response.error.description);
        alert(response.error.source);
        alert(response.error.step);
        alert(response.error.reason);
        alert(response.error.metadata.order_id);
        alert(response.error.metadata.payment_id);
});
document.getElementById('rzp-button1').onclick = function(e){
    rzp1.open();
    e.preventDefault();
}
</script>
</body>
</html>