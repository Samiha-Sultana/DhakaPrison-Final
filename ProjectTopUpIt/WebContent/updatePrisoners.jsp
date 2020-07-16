<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="#E6E6FA">
	<form action="prisoner.jsp">
    <input type="submit" value="Go Back" />
</form>
	<form action="UpdatePrisoners" method="post">
	<table align="center">
		<tr>
			<td>National_ID:</td>
			<td><input type="text" name="National_ID" value=""></td>
		</tr>		
		<tr>
			<td>Prisoner_ID:</td>
			<td><input type="text" name="Prisoner_ID" value=""></td>
		</tr>
		<tr>
			<td>Prisoner_Name:</td>
			<td><input type="text" name="Prisoner_Name" value=""></td>
		</tr>
		<tr>
			<td>Entry_Date:</td>
			<td><input type="text" name="Entry_Date" value=""></td>
		</tr>
		<tr>
		<td>Release_Date:</td>
			<td><input type="text" name="Release_Date" value=""></td>
		</tr>
		<tr>
		
		<td>Address:</td>
			<td><input type="text" name="Address" value=""></td>
		</tr>
		<tr>
		
		<td>Crime_Name:</td>
			<td><input type="text" name="Crime_Name" value=""></td>
		</tr>
		<tr>
		
			<td><input type="submit" value="submit" name="submit"></td>
			<td><input type="reset" name="reset" value="Clear"></td>
		</tr>
		
		</table>
	</form>

</body>
</html>