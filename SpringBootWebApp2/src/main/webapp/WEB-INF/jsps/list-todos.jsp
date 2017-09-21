<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
		rel="stylesheet">
</head>

<body>
<div class="container">
	<h1>Your Todos</h1>
	<table class="table">
		<thead>
		<caption>Your Todo's are..</caption>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Completed?</th>
			<th>Delete</th>
		</tr>
		<thead>
		<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<th>${todo.desc}</th>
				<th>${todo.targetDate}</th>
				<th>${todo.done}</th>
				<th><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></th>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
	<div></div><a href="/add-todos" class="button">Add a Todo</a></div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>

</html>
