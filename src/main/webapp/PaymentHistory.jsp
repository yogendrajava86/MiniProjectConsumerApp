<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card Payment History</title>
<style>
body{margin:0;padding:0;}
.head{background: blue;color:#fff;hight:150px;padding:25px;}
.contentArea{background: light-blue;color:#000;padding:25px;}
.foot{background: blue;color:#fff;padding:25px;}
</style>
<script type="text/javascript">
function addPay(){
	document.location.href="CardUi.jsp";
}
</script>
</head>
<body>
<section class="head">
<h2>Welcome To Card Payment Service</h2>
</section>
<section class="contentArea">
	 <button onclick="addPay();">Add Payment</button>
	<table border="1">
		<tr>
			<th>TXID</th>
			<th>CardHolderName</th>
			<th>CardNumber</th>			
			<th>Amount</th>
			<th>Option</th>
		</tr>
		<c:forEach items="${list}" var="element"> 
			<tr>
			    <td style="padding:10px">${element.txId}</td>
			    <td style="padding:10px">${element.cname}</td>
			    <td style="padding:10px">${element.cnum}</td>			    
			    <td style="padding:10px">${element.amt}</td>
			    <td style="padding:10px"><a href="viewinfo?txid=${element.txId}">View</a></td>
			</tr>
			</c:forEach>
		<tr></tr>
	</table>
</section>
<section class="foot">

<h6>&copy;2019 All rights reserved. Developed By: Yogendra Kumar Dixit</h6>
</section>
</body>
</html>