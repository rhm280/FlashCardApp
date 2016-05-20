<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap Core CSS -->
<link href="metro-bootstrap-master/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="metro-bootstrap-master/css/metro-bootstrap.css"
	rel="stylesheet" type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flashcard Application Home</title>
</head>
<body>
<div class = "col-sm-offset-3 col-sm-10">
<h1>Flash Card Home</h1>
<div class = "col-sm-offset-1 col-sm-10">
<tr>
<td><input type="button" value="Add New Card" class = "btn btn-lrg" onClick="location.replace('${pageContext.request.contextPath}/pages/newcard.jsp')"></td>
<td><input type="button" value="Show All cards" class = "btn btn-lrg" onClick="location.replace('${pageContext.request.contextPath}/pages/allcards.jsp')"></td>
<td><input type="button" value="Random Card" class = "btn btn-lrg" onClick="location.replace('${pageContext.request.contextPath}/pages/randcard.jsp')"></td>
</tr>
</div>
</div>
<!-- Bootstrap Core JavaScript -->
<script src="bootstrap/js/bootstrap.min.js"type = "text/javascript"></script>
</body>
</html>