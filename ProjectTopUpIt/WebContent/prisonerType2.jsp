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

#logoutButton{
    height:100px; 
    width:200px; 
    margin: -20px -50px; 
    position:relative;
    top:50%; 
    left:50%;
    font-size: 24px;
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
   margin-left:25px;
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
<li ><a href="Home.jsp">Home</a></li>
<li><a href="admin.jsp">Admin</a></li>
<li><a href="prisoner.jsp">Prisoner</a></li>
<li class="first active"><a href="prisonerType2.jsp">Death Penalty Prisoner</a></li>
<li><a href="guard.jsp">Guard</a></li>
<li><a href="clinic.jsp">Doctor</a></li>
<li ><a href="executioner.jsp">Executioner</a></li>
</ul>
<br class="clear"/>
</div>
</div>

<div id="banner">
<img width="950" height="300" alt="" src="images\lonely.jpg"/>
</div>

<div id="main">
<div>
<p>To view all the prisoners:</p>
<form action="RetrievePrisonerType2">
    <input type="submit" value="Click here" />
</form>
<div>
<p>To add a new prisoner:</p>
<form action="insertPrisonerType2.jsp">
    <input type="submit" value="Click here" />
</form>
</div>
<div>
<p>To update prisoner's information:</p>
<form action="updatePrisonerType2.jsp">
    <input type="submit" value="Click here" />
</form>
</div>
<div>
<p>To delete a prisoner:</p>
<form action="deletePrisonerType2.jsp">
    <input type="submit" value="Click here" />
</form>
</div>
</div>
</div>
</div>
</body>
</html>