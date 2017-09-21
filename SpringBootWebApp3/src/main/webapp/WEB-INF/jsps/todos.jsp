<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>
<div class="container">
		This is Add Todo Page...
		<form:form method="post" commandName="todo">
		<form:errors path="desc" cssClass="text-warning"/>
			<div class="form-group">
				<form:label path="desc">Description:</form:label> 
				<form:input path="desc" type="text" class="form-control" />				
			</div>
			<div class="form-group">
				<form:label path="targetDate">Target Date:</form:label> 
				<form:input path="targetDate" type="text" class="form-control" />				
			</div>								
			<button type="submit" class="btn btn-success">Add</button>
			
		</form:form>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script src="webjars/bootstrap-datepicker/1.6.4/js/bootstrap-datepicker.js"></script>
		
		<script>
		$('#targetDate').datepicker({
		    format: 'mm/dd/yyyy'
		});
		</script>
	</div>
<%@ include file="common/footer.jspf" %>