<%@page import="prisoner.model.Prisoners"%>
<%@page import="guard.model.Guard"%>
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

		<form action="guard.jsp">
    <input type="submit" value="Go Back" />
</form>
		<table align="center" border="1">
			<tr>
				<td>Prisoner_ID</td>
				<td>Prisoner_Name</td>
				<td>Cell_No</td>
			</tr>
			<%
				List list=(List)request.getAttribute("prisonerlist");
				Iterator it=list.iterator();
				while(it.hasNext())
				{
					Prisoners guard=(Prisoners)it.next();
					%>
					<tr>
						<td><%=guard.getPrisoner_ID() %></td>
						<td><%=guard.getPrisoner_Name() %></td>
						<td><%=guard.getCell_No() %></td>
					</tr>
					<%
				}
				
			%>
		</table>
		
</body>
</html>