<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Top Ten Songs</title>
</head>
<body>
	<p>Top Ten Songs:</p>
	<a href="/dashboard">Dashboard</a>
	
	<br>
	
	
	<fieldset>
		<c:forEach items="${songs}" var="song" varStatus="loop">
			<p>${song.rating} - <a href="../songs/<c:out value="${song.id}"/>">${song.name}</a> - ${song.artist}</p>
		</c:forEach>
	</fieldset>
</body>
</html>