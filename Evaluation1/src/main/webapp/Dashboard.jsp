<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">BOOK UR PLACE</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="MainPage.html">Home</a></li>


				</ul>
				<div>
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">user<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="MainPage.html">Sign out</a></li>
							</ul></li>
					</ul>
				</div>
		</nav>
		<form action="/Booking" method="post">
			
			<table border="1">
				
					<tr>
						<th>Movie name</th>
						<th>release date</th>
						<th>book show</th>
						
					</tr>
				
			
				
						<c:forEach var="namearray" items="${Moviess}">
							<tr>
							<td>${namearray.movie_name}</td>
							
							<td>${namearray.release_date}</td>
							
							<td><form name="f1" action="booking" >
                           <input type="submit" value="BOOK">
                             </form></td>
							</tr>
							
						</c:forEach>
					
				
			</table>
			
		</form>
</body>
</html>