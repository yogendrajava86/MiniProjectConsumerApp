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
function back(){
	document.location.href="getAll";
}
</script>
</head>
<body>
<section class="head">
<h2>Welcome To Card Payment Service</h2>
</section>
<section class="contentArea">

<table border="1">
	<tr><th>TxID : </th><td>${ob.txId}</td></tr>
	<tr><th>CardHolderName : </th><td>${ob.cname}</td></tr>
	<tr><th>Card Number : </th><td>${ob.cnum}</td></tr>
	<tr><th>CVV : </th><td>${ob.cvv}</td></tr>
	<tr><th>Exp Date : </th><td>${ob.expDate}</td></tr>
	<tr><th>Amount : </th><td>${ob.amt}</td></tr>
	<tr><th></th><td><button onclick="back();">Back</button></td></tr>
	
</table>
</section>
<section class="foot">

<h6>&copy;2019 All rights reserved. Developed By: Yogendra Kumar Dixit</h6>
</section>
</body>
</html>