<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title><c:out value="${language.name}"/></title>
	<style>
	*{
	margin: 0px;
	padding: 10px;
	
	}
	body{
		display: flex;
		flex-direction: column;
		align-items: left;
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
	<a href="/languages/delete/${id}">Delete</a>
	<a href="/">Dashboard</a>
<form:form action="/languages/edit/${id}" method="POST" modelAttribute="language">

	
	
	<form:label path="name">Name:
		<form:errors path="name"/>
		<form:input path="name"/>
	</form:label>

	<form:label path="creator">Creator:
		<form:errors path="creator"/>
		<form:input path="creator"/>
	</form:label>


	<form:label path="version">Version:
		<form:errors path="version"/>
		<form:input path="version"/>
	</form:label>

	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>