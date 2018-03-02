<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Welcome!</title>
	<style>
	#main{
		display: flex;
		flex-direction: column;
		align-items: center;
	}
	</style>
</head>
<body>
	<div id='main'>
		<h1>Welcome back, Victor!</h1>
		<br>
		<a href="/counter">Do it ..</a>
		<a href="/increment">Double it!</a>
		<a href="/reset">Reset button!</a>
	</div>
</body>
</html>