<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>
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
			<th>Update</th>
		</tr>
		<thead>
		<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<th>${todo.desc}</th>
				<th><fmt:formatDate value="${todo.targetDate}" pattern="MM/dd/yyyy"/></th>
				<th>${todo.done}</th>
				<th><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></th>
				<th><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">Update</a></th>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
	<div></div><a href="/add-todos" class="button">Add a Todo</a></div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
<%@ include file="common/footer.jspf" %>
