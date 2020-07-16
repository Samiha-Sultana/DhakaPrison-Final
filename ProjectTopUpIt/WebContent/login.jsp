<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<h1 align="center">Welcome to the authorized network of Dhaka Prison</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #228B22;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img {
   height:400px;
    width: 1000px;
  
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
</head>
<body>

<form action="ValidateDemo" method="post">
  <div class="imgcontainer">
    <img src="images\gold-handcuffs.jpg">
  </div>
   <p>Please log in first:</p>
  <div class="container">
    <label for="uname"><b>User name</b></label>
    <input type="text" name="una">

    <label for="psw"><b>Password</b></label>
    <input type="password" name="pwd">
        
    <button type="submit" value="Login">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <form action="Home.jsp">
    <input type="submit" class="cancelbtn" value="Cancel"></input>
    </form>
    
  </div>
</form>
</body>
</html>