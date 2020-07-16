<%@page import="prisonerType2.model.PrisonerType2"%>
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
	<form action="prisonerType2.jsp">
    <input type="submit" value="Go Back" />
</form>

		<table align="center" border="1">
			<tr>
				<td>National_ID</td>
				<td>Prisoner_ID</td>
				<td>Prisoner_Name</td>
				<td>Entry_Date</td>
				<td>Execution_Date</td>
				<td>Address</td>
				<td>Crime_Name</td>
			</tr>
			<%
				List list=(List)request.getAttribute("prisonerlist");
				Iterator it=list.iterator();
				while(it.hasNext())
				{
					PrisonerType2 prisonersExecution=(PrisonerType2)it.next();
					%>
					<tr>
						<td><%=prisonersExecution.getNational_ID() %></td>
						<td><%=prisonersExecution.getPrisoner_ID() %></td>
						<td><%=prisonersExecution.getPrisoner_Name() %></td>
						<td><%=prisonersExecution.getEntry_Date()%></td>
						<td><%=prisonersExecution.getExecution_Date()%></td>
						<td><%=prisonersExecution.getAddress()%></td>
						<td><%=prisonersExecution.getCrime_Name() %></td>
					</tr>
					<%
				}
				
			%>
		</table>
		
</body>
</html>