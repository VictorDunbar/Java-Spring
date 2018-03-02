<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Counter Result</title>
	<style>
	#main{
		display: flex;
		flex-direction: column;
		align-items: center;
	}
	</style>
</head>
<body>
	<div id="main">
		<p>You have visited <a href='/'>localhost:8080</a>
		<span id="counter"><c:out value="${counter}"/></span>
		times.
		</p>
		<br>
		<a href="/">Test me</a>
	</div>
</body>
</html>