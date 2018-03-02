<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Group Languages</title>
	<style>
	*{
	margin: 0px;
	padding: 10px;
	
	}
	body{
		display: flex;
		flex-direction: column;
		align-items: center;
		margin: 50px;
	}
	form{
		display: flex;
		flex-direction: column;
		width: 200px;
		margin-top: 10px;
	}
	
	input[type="submit"]{
		width: 100px;
		margin-top: 10px;
	}
	table {
    border-collapse: collapse;
	}

	table, tr, td {
    border: 1px solid black;
	}
</style>
	</head>
	<body>
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Actions</th>
			</tr>
			<c:forEach items="${languages}" var="language">
    			<tr>    
   				<td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
    				<td><c:out value="${language.creator}"/></td>
    				
    				<td><c:out value="${language.version}"/></td>
    				<td><a href="/languages/delete/${language.id}">Delete</a> <a href="/languages/edit/${language.id}">Edit</a></td>
    			</tr>
			</c:forEach>
		</table>
		<form:form action="/languages/add" method="POST" modelAttribute="language">
			<form:hidden path="id"/>
			<form:label path="name">Name: 
			<form:input type="text" path="name"/><br></form:label>
			<form:label path="creator">Creator: 
			<form:input type="text" path="creator"/><br></form:label>
			<form:label path="version">Version: 
			<form:input type="text" path="version"/><br></form:label>
			
			<input type="submit" value="Submit">
			<c:forEach items="${errors}" var="error">
				<p><c:out value="${error.getDefaultMessage()}"/></p>
			</c:forEach>
		</form:form>
	</body>
</html>