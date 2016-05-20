<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap Core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="metro-bootstrap-master/css/metro-bootstrap.css"
	rel="stylesheet" type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Random Card</title>
</head>
<body>

	<sql:setDataSource var="oracle"
		url="jdbc:Oracle:thin:@//localhost:1521/xe" user="admin"
		password="admin" />

	<div class="col-sm-offset-2 col-sm-10">
		<sql:query datasource="${oracle}" var="result" scope="session">
SELECT*FROM(SELECT*FROM FLASH_CARD ORDER BY dbms_random.value) WHERE rownum = 1
</sql:query>

		<c:forEach var="row" items="${result.rows}">
			<h1>
				<c:out value="${row.question }" />
			</h1>
			<div class="col-sm-offset-1 col-sm-10">
				<tr>
					<h2 class="bg-success" id="answer"></h2>
				</tr>
			</div>
			<script>
				function ans() {
					document.getElementById("answer").innerHTML = "<c:out value="${row.answer }"/>";

				}
			</script>
		</c:forEach>
		<div class="col-sm-offset-1 col-sm-10">
			<tr>
				<td><button id="btn" name="btn" class="btn btn-lrg"
						onClick="ans()">Show Answer</button></td>
				<td><input type="button" value="Next Question"
					class="btn btn-lrg" onClick="window.location.reload()"></td>
			</tr>
			<tr>
				<input type="button" value="Home" class="btn btn-lrg"
					onClick="location.replace('home.jsp')">
			</tr>
		</div>
	</div>
</body>
</html>