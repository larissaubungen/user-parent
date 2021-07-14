<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Product</title>
</head>
<body>
<h3>Enter Product Details</h3>
<form method="post" action="AddUserServlet">
	<div>User Id: <input name="id"></div>
	<div>User Name: <input name="name"></div>
	<div>User Description: <input type="email" name="email"></div>
	<input type="submit" value="Submit">
</form>
<br/>
<hr/>
<form method="get" action="DisplayUserServlet">
	<div>User Id: <input name="id"></div>
	<input type="submit" value="Submit">
</form>
</body>
</html>