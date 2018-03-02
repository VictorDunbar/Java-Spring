<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome, <c:out value="${currentUser.first_name }"></c:out></h1>
	<fieldset>
		<p>First Name: <c:out value="${currentUser.first_name}"/></p>
		<p>Last Name: <c:out value="${currentUser.last_name}"/></p>
		<p>Email: <c:out value="${currentUser.email}"/></p>
		<p>Sign up date: <c:out value="${currentUser.createdAt}"/></p>
		<p>Last sign in: <c:out value="${currentUser.lastLoggedin}"/></p>
	</fieldset>
	<br>
	<form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
</body>
</html>