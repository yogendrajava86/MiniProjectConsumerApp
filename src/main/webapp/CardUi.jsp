<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card Payment Service</title>
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

<form action="dopay" method="post" style="border:1px solid #4d4d4d; border-radius:4px;padding:25px;">
<pre>
Name		:	<input type="text" name="cname"/><br/>
Card Number	:	<input type="text" name="cnum"/><br/>
CVV		:	<input type="password" name="cvv" size="2"/> ExpDate :<input type="text" name="expDate" size="3"/><br/>
Amount		:	<input type="text" name="amt"/><br/>
			<input type="submit" value="PAY AMOUNT"/> <input type="button" onclick="back();" value="Back"/>

</pre>
</form>
</section>
<section class="foot">
${message}
<h6>&copy;2019 All rights reserved. Developed By: Yogendra Kumar Dixit</h6>
</section>

</body>
</html>