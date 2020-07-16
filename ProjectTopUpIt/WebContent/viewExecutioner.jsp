<%@page import="executioner.model.PrisonersExecutioner"%>
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
	<form action="executioner.jsp">
    <input type="submit" value="Go Back" />
</form>
		<table align="center" border="1">
			<tr>
				<td>National_ID</td>
				<td>Executioner_ID</td>
				<td>Executioner_Name</td>
				<td>Prisoner_ID</td>
				<td>Duty_Date</td>
				
			</tr>
			<%
				List list=(List)request.getAttribute("prisonerlist");
				Iterator it=list.iterator();
				while(it.hasNext())
				{
					PrisonersExecutioner prisonersExecutioner=(PrisonersExecutioner)it.next();
					%>
					<tr>
						<td><%=prisonersExecutioner.getNational_ID() %></td>
						<td><%=prisonersExecutioner.getExecutioner_ID() %></td>
						<td><%=prisonersExecutioner.getExecutioner_Name() %></td>
						<td><%=prisonersExecutioner.getPrisoner_ID()%></td>
						<td><%=prisonersExecutioner.getDuty_Date()%></td>
						
					</tr>
					<%
				}
				
			%>
		</table>
		

</body>
</html>