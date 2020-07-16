<%@page import="prisoner.model.Prisoners"%>
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
	<form action="prisoner.jsp">
    <input type="submit" value="Go Back" />
</form>

		<table align="center" border="1">
			<tr>
				<td>National_ID</td>
				<td>Prisoner_ID</td>
				<td>Prisoner_Name</td>
				<td>Entry_Date</td>
				<td>Release_Date</td>
				<td>Address</td>
				<td>Crime_Name</td>
			</tr>
			<%
				List list=(List)request.getAttribute("prisonerslist");
				Iterator it=list.iterator();
				while(it.hasNext())
				{
					Prisoners prisoners=(Prisoners)it.next();
					%>
					<tr>
						<td><%=prisoners.getNational_ID() %></td>
						<td><%=prisoners.getPrisoner_ID() %></td>
						<td><%=prisoners.getPrisoner_Name() %></td>
						<td><%=prisoners.getEntry_Date()%></td>
						<td><%=prisoners.getRelease_Date()%></td>
						<td><%=prisoners.getAddress()%></td>
						<td><%=prisoners.getCrime_Name() %></td>
					</tr>
					<%
				}
				
			%>
		</table>

</body>
</html>