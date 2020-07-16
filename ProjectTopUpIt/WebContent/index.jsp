<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Dhaka Prison Website</title>
<style>


body {
	margin: 0;
	padding: 0;
	background: #FFFFFF;
	font-family: 'Open Sans', sans-serif;
	font-size: 13px;
	color: #5B5B5B;
}

h1, h2, h3 {
	margin: 0;
	padding: 0;
	font-weight: normal;
	font-weight: 200;
	color: #222222;
}

h1 {
	font-size: 2em;
}

h2 {
	font-size: 2.8em;
}

h3 {
	font-size: 1.6em;
}

p, ul, ol {
	margin-top: 0;
	line-height: 180%;
}

ul, ol {
}

a {
	color: #50B200;
}

a:hover {
	text-decoration: none;
}

#wrapper {
}

.container {
	width: 1000px;
	margin: 0px auto;
}

/* Header */

#header-wrapper {
	overflow: hidden;
	height: 600px;
	background: #000000;
}

#header {
	overflow: hidden;
	width: 1000px;
	height: 150px;
	margin: 0 auto;
	padding: 0px 0px;
}

/* Logo */

#logo {
	float: left;
	width: 300px;
	margin: 0;
	padding: 0;
	color: #FFFFFF;
}

#logo h1, #logo p {
}

#logo h1 {
	line-height: 120px;
	letter-spacing: -2px;
	font-size: 3em;
}

#logo h1 a {
	color: #FFFFFF;
	text-transform: uppercase;
}

#logo p {
	margin: 0;
	padding: 0px 0 0 0px;
	letter-spacing: -1px;
	font: normal 18px Georgia, "Times New Roman", Times, serif;
	font-style: italic;
	color: #8E8E8E;
}

#logo p a {
	color: #8E8E8E;
}

#logo a {
	border: none;
	background: none;
	text-decoration: none;
	color: #12212F;
}

/* Splash */

#splash {
	width: 960px;
	height: 300px;
	margin: 0px auto;
}


/* Menu */

#menu {
	float: right;
	width: 500px;
	height: 90px;
	margin: 0 auto;
	padding: 0;
}

#menu ul {
	float: right;
	margin: 0;
	padding: 50px 0px 0px 0px;
	list-style: none;
	line-height: normal;
}

#menu li {
	float: left;
	padding: 0px 0px 0px 0px;
}

#menu a {
	display: block;
	margin-right: 1px;
	padding: 10px 20px 10px 20px;
	text-decoration: none;
	text-align: center;
	font-size: 13px;
	font-weight: 300;
	color: #FFFFFF;
	border: none;
}

#menu a:hover, #menu .current_page_item a {
	text-decoration: none;
	color: #FFFFFF;
}

#menu .current_page_item a {
	background: #50B200;
	border-radius: 5px;
}

/* Page */

#page {
	width: 1000px;
	margin: 0 auto;
	padding: 30px 0px;
	background: #FFFFFF;
}

/* Content */

#content {
	float: left;
	width: 660px;
	padding: 0px 0px 0px 0px;
}

.post {
	overflow: hidden;
	margin-bottom: 40px;
}

.post .title {
	padding: 7px 0px 40px 0px;
	letter-spacing: -1px;
}

.post .title a {
	border: none;
	text-decoration: none;
	color: #222222;
}

.post .meta {
	margin-bottom: 30px;
	padding: 10px 0px 0px 0px;
	text-align: left;
	font-family: 'Abel', sans-serif;
	font-size: 16px;
	font-weight: 300;
}

.post .meta .date {
	float: left;
}

.post .meta .posted {
	float: right;
}

.post .meta a {
}

.post .entry {
	padding: 0px 0px 40px 0px;
	text-align: justify;
}

.links {
	padding-top: 20px;
	margin-bottom: 30px;
}





/* Three Column Footer Content */

#footer-content-wrapper {
}

#footer-content {
	overflow: hidden;
	width: 1000px;
	margin: 0px auto;
	padding: 50px 0px;
	color: #FFFFFF;
}

#footer-content h2 {
	color: #FFFFFF;
}

#footer-content a {
}

#footer-bg {
	overflow: hidden;
	padding: 30px 0px;
	background: #E8E8E8;
}

#footer-content h2 {
	margin: 0px;
	padding: 0px 0px 20px 0px;
	font-size: 26px;
	color: #FFFFFF;
}

#footer-content #fbox1 {
	float: left;
	width: 300px;
	margin-right: 50px;
}

#footer-content #fbox2 {
	float: left;
	width: 300px;
}

#footer-content #fbox3 {
	float: right;
	width: 300px;
}

#footer-content a {
}

#column1 {
	float: left;
	width: 290px;
	margin-right: 30px;
}

#column2 {
	float: left;
	width: 280px;
}

#column3 {
	float: right;
	width: 260px;
}

/* Footer */

#footer {
	height: 140px;
	margin: 0 auto;
	padding: 50px 0 15px 0;
	background: #000000;
}

#footer p {
	margin: 0;
	padding-top: 10px;
	letter-spacing: 1px;
	line-height: normal;
	text-align: center;
	color: #FFFFFF;
}

#footer a {
	color: #2A2A2A;
	
}

#banner {
	margin: 0px auto;
	width: 1000px;
	height: 440px;
	background: url(images/img03.png) no-repeat left bottom;
}

#banner .content {
}

.list-style1 {
	margin: 0px;
	padding: 0px;
	list-style: none;
}

.list-style1 a {
	color: #7F7F7F;
}

#featured-content {
	overflow: hidden;
	width: 1000px;
	margin: 0px auto;
	padding: 30px 0px;
	border-bottom: 5px solid #E9EAEE;	
}

#featured-content h2 {
	padding: 0px 0px 20px 0px;
	font-size: 30px;
}

#featured-content #column1 {
	float: left;
	width: 300px;
	margin-right: 50px;
}

#featured-content #column2 {
	float: left;
	width: 300px;
}

#featured-content #column3 {
	float: right;
	width: 300px;
}

.button a {
	display: block;
	float: left;
	width: 88px;
	padding: 5px 5px;
	margin-right: 10px;
	background: #50B200;
	border-radius: 5px;
	color: #FFFFFF;
	text-align: center;
	text-decoration: none;
}
</style>
</head>

<body>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1><a href="#"> Dhaka Prison</a></h1>
			</div>
			<div id="menu">
				<ul>
				
					<li>For authorized Personnel only: <a href="login.jsp">Login</a></li>
				</ul>
			</div>
		</div>
		<div id="banner">
			<div class="content"><img src="images/model.jpg" width="1000" height="400" alt="" /></div>
		</div>
	</div>
	<!-- end #header -->
	<div id="featured-content">
		<div id="column1">
			<h2>High Security</h2>
			<p><img src="images/security.jpg" width="300" height="150" alt="" /></p>
			<p>As prisons become more crowded and internal problems arise, it is important to keep control and stability inside and outside of the prison. For physical security, we have implemented electric fences all around our prisons, and for internal security CCTV are placed in front of each cell</p>
	</div>
		<div id="column2">
			<h2>Medical Check ups</h2>
			<p><img src="images/medical.jpg" width="300" height="150" alt="" /></p>
			<p>We treat our prisoners humanely as opposed to the other prisons in the region. We provide them with regular heart and blood tests. In addition, we councel them with the visiting psychologists that attend our workshops every month. We realize all these measures are crucial and are the rights of the prisoners</p>
		</div>
		<div id="column3">
			<h2>Family days</h2>
			<p><img src="images/family.jpg" width="300" height="150" alt="" /></p>
			<p>We believe every prisoner be given the right to see their families once in a while, which is why we organize family days every 3 months. This program also benefited us by keeping inmate's aggressive and fighting nature lower. We try to keep as mentally happy as we can to keep a smooth environment in the prison.</p>
		</div>
	</div>

		<div style="clear: both;">&nbsp;</div>
	
	<!-- end #page --> 
</div>
<div id="footer">
	<p class="copyright"">&copy Dhaka Prison Website 2018. All rights reserved.</p>
</div>
<!-- end #footer -->

</body>
</html>