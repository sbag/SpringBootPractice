<html>

<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<font color="red">${errorMessage}</font>
		<form method="post">
			<div class="form-group">
				<label>Name:</label> <input type="text" class="form-control"
					name="name" />
			</div>
			<div class="form-group">
				<label>Password:</label> <input type="password" name="password"
					class="form-control" />
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>

</html>
