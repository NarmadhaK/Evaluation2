<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<style>
img {
	background-image: url("tom.jpg");
	background-repeat: repeat-x;
	background-position: center;
	background-size: cover;
	width: 15%;
	height: 10%;
}
</style>

</head>
<body>
	<form class="form-signin" action="Register/MainPage" method="post">
		<p>
			<img src="newuser.jpg"></img>
		</p>
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<h1 class="text-center login-title">
					<b>WELCOME</b>
				</h1>

				<div class="account-wall">

					Username<input type="text" class="form-control" name="username"
						placeholder="Username" /></br> Password<input type="password"
						class="form-control" name="password" placeholder="Password" /> </br>
					FirstName<input type="text" class="form-control" name="firstname"
						placeholder="name" /> </br> Last Name<input type="text"
						class="form-control" name="lastname" placeholder="LastName" /> </br>
					Email Address<input type="text" class="form-control" name="email"
						placeholder="emailid " /> </br> Address<input type="text"
						class="form-control" name="address" placeholder="address" /> </br>
					UserRole<input type="text" class="form-control" name="userrole"
						placeholder="userrole" /> <input
						class="btn btn-primary btn-lg active" type="submit" name="submit"
						value="Register" />
						</div>
			</div>
		</div>
	</form>
</body>
</html>