<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<title>Learning Platform</title>
	<style>
		.main{
		display: flex;
		flex-direction: column;
		align-items: center;
		}
		#assign{
		display: flex;
		flex-direction: column;
		justify-content: flex-end;
		}
	
	</style>

</head>
<body>
	<div class="main">
	<h1>Fortran!</h1>
	<div class="link-menu">
		<a href="/m/38/0553/0733">Set up</a> | <a href="/m/38/0483/0345">Forms</a> | <a href="/m/38/0553/0342">Cards</a> | <a href="/m/26/0553/0348">Advanced</a> | <a href="/m/26/0483/2342">Binary</a>
	</div>
	<br>
	<div id="assign">
	<form>
		<input type="checkbox" name="complete">
		
		<label for="complete">Assignment completed</label>
		<br>
		<br>
	</form>
	<textarea cols=50 rows=5 readonly><c:out value="${assignment}"/></textarea>
	</div>
	<a href="/">Back</a>
	</div>
</body>
</html>