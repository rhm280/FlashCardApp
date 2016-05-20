<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap Core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/shop-homepage.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a New Flash Card</title>
</head>
<body>
<div class = "col-sm-offset-2 col-sm-10">
<div class = "col-sm-offset-1 col-sm-12">
<h1>Add a new Flash card</h1>
</div>
<div class = "col-sm-offset-1 col-sm-10">
<form class = "form-horizontal" id= "form" name = "form" action="${pageContext.request.contextPath}/newcard.do" method="post" >
<div class  = "col-sm-offset-1 col-sm-10">
<div class = "form-group">
<label for = "question"> Question: </label>
<div class="input-group input-group-lg">
<input type = "text" class = "form-control"  name = "question" id = "question" placeholder = "Enter here" focus>
</div>
</div>
<div class = "form-group">
<label for = "answer"> Answer: </label>
<div class="input-group input-group-lg">
<input type = "text" class = "form-control" name = "answer" id = "answer" placeholder = "Enter here" focus>
</div>
</div>
<div class = "col-sm-offset-1 col-sm-11">
<button type="submit" class="btn btn-lrg"> Add Flash Card</button>
</div>
<div class = "col-sm-offset-1 col-sm-12">
<input type="button" value="Home" class = "btn btn-lrg" onClick= "location.href = 'home.jsp'">
</div>
</div>
</form>
</div>
</div>

</body>
</html>