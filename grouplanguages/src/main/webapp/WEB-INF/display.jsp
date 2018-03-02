<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Group Languages</title>
		<style>
			*{
	margin: 0px;
	padding: 0px;
	
	}
	body{
		display: flex;
		flex-direction: column;
		align-items: left;
		margin: 100px;
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
		<a href="/languages">Dashboard</a><br>
		<c:out value="${language.name}"/>
		<br>
		<c:out value="${language.creator}"/>
		<br>
		<c:out value="${language.version}"/>
		<br>
		<br>
		<a href="/languages/delete/${language.id}">Delete</a>
		<br>
		<a href="/languages/edit/${language.id}">Edit</a>
	</body>
</html>