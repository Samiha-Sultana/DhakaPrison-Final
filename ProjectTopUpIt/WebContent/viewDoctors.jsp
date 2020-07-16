<%@page import="doctor.model.Doctors"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
		<table align="center" border="1">
			<tr>
				<td>Doctor_ID</td>
				<td>Doctor_Name</td>
				<td>Prisoner_ID</td>
				
			</tr>
			<%
				List list=(List)request.getAttribute("doctorlist");
				Iterator it=list.iterator();
				while(it.hasNext())
				{
					Doctors doctors=(Doctors)it.next();
					%>
					<tr>
						<td><%=doctors.getDoctor_ID() %></td>
						<td><%=doctors.getDoctor_Name() %></td>
						<td><%=doctors.getPrisoner_ID() %></td>
						
					</tr>
					<%
				}
				
			%>
		</table>

</body>
</html>