<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="metro-bootstrap-master/css/metro-bootstrap.css"
	rel="stylesheet" type="text/css" />
<title>FlashCardApp Login</title>
</head>
<body>
	<header class="clearfix"></header>
	<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle Navigation</span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Flash Card Application</a>
		</div>
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="register.jsp">Sign Up</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<h1 class="bg-primary img-rounded text-center">Login</h1>
				<div class="form-group">
	<form id="form" name="form" action="${pageContext.request.contextPath}/Login.do" method="post">
	<div id="block">
		<table class="table table-striped" border="0">
			<tr>
				<td><label for="username" class="control-label">Username</label></td>
				<td><input type="text" name="username"
					class="form-control input" id="username" /></td>
			</tr>
			<tr>
				<td><label for="password" class="control-label">Password</label></td>
				<td><input type="password" name="password"
					class="form-control input-lg" id="password">
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Login" class="btn btn-default btn-lg" id="login"></td>
			</tr>
		</table>
	</div>
</form>
<script
		src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>