<%@page import="admin.model.Admin"%>
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
<title>Admin details</title>
</head>
<body>
<body bgcolor="#E6E6FA">
	<form action="admin.jsp">
    <input type="submit" value="Go Back" />
</form>

		<table align="center" border="1">
			<tr>
						<td>Admin_Name</td>
			</tr>
			<%
				List list=(List)request.getAttribute("adminlist");
				Iterator it=list.iterator();
				while(it.hasNext())
				{
					Admin admin=(Admin) it.next();
					%>
					<tr>
               <td><%=admin.getAdmin_name() %></td>
					</tr>
					<%
				}
				
			%>
		</table>

</body>
</html>