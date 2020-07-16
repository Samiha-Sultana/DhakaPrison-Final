<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inside Prison</title>
<style>
body{
font-size: 12pt;
line-height: 1.75em;
font-family: Georgia,serif;
background:#D2E0DD;
color:#382b31;
}
#bg{
background:grey;
padding:0 0 64px 0;
}
*{
margin:0;
}

#outer{
position:relative;
width:980px;
margin: 0 auto 0 auto;
background: #fff;
}
#header {
    position: relative;
    padding: 24px;
    height: 150px;
    width: 932px;
    background: #34564f;
    color: #fff;
}
#logo {
    position: absolute;
    top: 0px;
    left: 24px;
    height: 150px;
    line-height: 150px;
}

h1, h2, h3, h4 {
    text-transform: lowercase;
}


#logo a {
    text-decoration: none;
    color: #fff;
}

#logoutButton{
    height:100px; 
    width:200px; 
    margin: -20px -50px; 
    position:relative;
    top:50%; 
    left:50%;
    font-size: 24px;
}

#search {
    position: absolute;
    top: 0px;
    right: 24px;
    height: 150px;
    line-height: 150px;
}
#nav {
    position: absolute;
    bottom: 0px;
    left: 0px;
    height: 57px;
    line-height: 57px;
    padding: 0 24px 0 24px;
    width: 932px;
    margin: 0 0 0 0;
    background: #117848;

    text-align: center;
}
#nav li {
    margin: 0 1em 0 0;
    padding: 0 1em 0 1em;
    
}
#nav ul {
    list-style: none;
}
#nav ul li {
    float: left;
}
#nav a {
    text-decoration: none;
    text-transform: lowercase;
    color: #fff;
}

li a:hover {
    background-color: red;
    color: white;
}
ul {
    margin-bottom: 1.5em;
}


#nav li.active {
    background: #FF0000;
}

#banner {
    position: relative;
    padding: 24px;
    height: 172px;
    width: 932px;
    margin: 0 0 0 0;
    background: #fff;
}

#main {
    position: relative;
    padding: 24px;
    height:auto;
    width: 932px;
    color: #5e5e5e;
    margin:100px;
    margin-left:10px;
   
}
#finaltext{
 border:1px solid black;
 align:right;
 height:auto;
}

* {
    margin: 0;
    padding: 0;
}
p {
    margin-bottom: 1.5em;
}


</style>

</head>
<body>
<div id="bg">

<div id="outer">
<div id=header>
<div id="logo">
<h1> Dhaka Prison Official Insider</h1>
</div>

<div id="search">
<form id="logoutButton" action="Logout" method="post">
<input class="button" type="submit" value="Logout"/>
</form>
</div>

<div id="nav">
<ul>
<li class="first active"><a href="Home.jsp">Home</a></li>
<li><a href="admin.jsp">Admin</a></li>
<li><a href="prisoner.jsp">Prisoner</a></li>
<li ><a href="prisonerType2.jsp">Death Penalty Prisoner</a></li>
<li><a href="guard.jsp">Guard</a></li>
<li><a href="clinic.jsp">Doctor</a></li>
<li><a href="executioner.jsp">Executioner</a></li>
</ul>
<br class="clear"/>
</div>
</div>

<div id="banner">
<img width="950" height="300" padding="0" alt="" src="images\lonely.jpg"/>
</div>

<div id="main">

<img width="200" height="165px" alt="" align="left" src="images\pinterest.jpg" />
<div id="finaltext" >
<p align="left" style="margin="10px">The Dhaka Prison is renowned for its punctual and reliable duties being assigned from the Federal Bureau of Bangladesh. It gives all the facilities to the administrators. We provide you with the facility to view all our Employees as well as all the Prisoners. Also you can view reports on all our Staff. Simply select your interested section from the Menu bar and generate all the reports or update details.
Thankyou  </p>
</div>

</div>
</div>
</div>
</body>
</html>