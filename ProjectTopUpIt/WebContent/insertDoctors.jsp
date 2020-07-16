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
	<form action="clinic.jsp">
    <input type="submit" value="Go Back" />
</form>
	<form action="InsertDoctors" method="post">
	<table align="center">
		<tr>
			<td>Doctor_ID:</td>
			<td><input type="text" name="Doctor_ID" value=""></td>
		</tr>		
		<tr>
			<td>Doctor_Name:</td>
			<td><input type="text" name="Doctor_Name" value=""></td>
		</tr>
		<tr>
			<td>Prisoner_ID:</td>
			<td><input type="text" name="Prisoner_ID" value=""></td>
		</tr>
		
			<td><input type="submit" value="submit" name="submit"></td>
			<td><input type="reset" name="reset" value="Clear"></td>
		</tr>
		
		</table>
	</form>

</body>
</html>