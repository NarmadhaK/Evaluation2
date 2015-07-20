<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<script src="bootstrap/js/jquery.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
	
	
	<style>
img {
    background-image: url("tom.jpg");
    background-repeat:repeat-x;
    background-position: center;
    background-size: cover;
    width: 40%;
    height: 20%;

}
</style>
	
</head>
<body>
	<img src="tom.jpg"></img>
	<div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title"><b>WELCOME</b></h1>
            
            <div class="account-wall">
            
                <form class="form-signin" action="Dashboard" method="post">
               Username <input type="text" class="form-control" name="usrname" placeholder="username"></input></br>
                Password<input type="password" class="form-control" name="pasword" placeholder="Password"></input></br>
                <input class="btn btn-primary btn-lg active" type="submit">
                    Login</a>
                    
                    
              </form>
            </div>
            
        </div>
    </div>
</body>
</html>