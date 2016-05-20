<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap Core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="metro-bootstrap-master/css/metro-bootstrap.css"
	rel="stylesheet" type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Flash Card Deck</title>
</head>
<body>
	<div class="col-sm-offset-2 col-sm-10">
		<div class="col-sm-offset-1 col-sm-12">
			<tr>
				<td><h1>Card Deck</h1></td>
				<td><input type="button" value="Home" class="btn btn-lrg"
					onClick="location.replace('home.jsp')"></td>
			</tr>
		</div>
		<div class="col-sm-offset-1 col-sm-11">
			<c:forEach var="card" items="${FlashCards}">
				<ul>
					<li>
						<td>
					<tr>
							<h3>
								Q:
								<c:out value="${card.question}"></c:out>
								</h1>
						</tr>
						<tr>
							<h4>
								A:
								<c:out value="${card.answer}"></c:out>
								</h1>
						</tr>
						</td>
					</li>
				</ul>
			</c:forEach>
		</div>
	</div>
</body>
</html>