<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
	<title>Ninja Gold</title>
	
	<style type="text/css">
		
		#main{
			display: flex;
			flex-direction: column;
			align-items: center;
		}
		#score-form{
			
			position: relative;
			right: 385px;
		}
		
		#places{
			display: flex;
			flex-direction: row;
			width: 1000px;
			padding: 10px;
			justify-content: space-between;
		}
		.place-box{
			margin-top: 10px;
			width: 200px;
			height: 200px;
			border: 2px solid black;
			display: flex;
			flex-direction: column;
			justify-content: center;
			align-items: center;
		}
		#activity-box{
			border: 2px solid black;
			width: 1000px;
			height: 200px;
			overflow-y: scroll;
		}
		.red{
			color: red;
		}
		.green{
			color: green;
		}
		.green, .red, .black{
			margin-top: 0px;
			margin-bottom: 0px;
			font-size: 14px;
		}
	</style>
</head>
<body>
	<div id="main">
		<form id="score-form">
			
			<label for="score">Ninja Gold:</label>
			<input type="text" name="score" value=<c:out value="${gold}"/> readonly>
		</form>
		<div id="places">
			<div id="farm" class="place-box">
				<h2>Farm</h2>
				<p>(earns 10-20 gold)</p>
				<form action="/process_da_money" method="post">
					
					<input type="hidden" name="place" value="farm">
					<input type="submit" value="Find Gold!">		
				</form>
			</div>
			<div id="cave" class="place-box">
				<h2>Cave</h2>
				<p>(earns 5-10 gold)</p>
				<form action="/process_da_money" method="post">
					
					<input type="hidden" name="place" value="cave">
					<input type="submit" value="Find Gold!">		
				</form>
			</div>
			<div id="house" class="place-box">
				<h2>House</h2>
				<p>(earns 2-5 gold)</p>
				<form action="/process_da_money" method="post">
					
					<input type="hidden" name="place" value="house">
					<input type="submit" value="Find Gold!">		
				</form>
			</div>
			<div id="casino" class="place-box">
				<h2>Casino</h2>
				<p>(earns/takes 0-50 gold)</p>
				<form action="/process_da_money" method="post">
					
					<input type="hidden" name="place" value="casino">
					<input type="submit" value="Roll the dice!">		
				</form>
			</div>
		</div>
		<div id="activities">
			<p>Activities:</p>
			<div id="activity-box">
			<c:forEach var="i" begin="0" end="${size}">
				<p class="<c:out value="${updates.get(i).get(0)}"/>"><c:out value="${updates.get(i).get(1)}"/> <c:out value="${updates.get(i).get(2)}"/></p>
			</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>