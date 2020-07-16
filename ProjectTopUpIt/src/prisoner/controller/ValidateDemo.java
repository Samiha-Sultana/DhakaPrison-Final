package prisoner.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateDemo
 */
@WebServlet("/ValidateDemo")
public class ValidateDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String una=request.getParameter("una");
		String pwd=request.getParameter("pwd");
		
		try {
		//Connection con=DbConn.getCon();
			ServletContext sc=getServletContext();
			Connection con=(Connection)sc.getAttribute("connObj");
		PreparedStatement st=con.prepareStatement("select * from login where Admin_Username=? and Password=?");
		st.setString(1, una);
		st.setString(2, pwd);
		ResultSet rs=st.executeQuery();
		if(rs.next())
		{
			String uname=rs.getString(1);
			
			pw.println(uname);
			RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
			rd.include(request, response);			
		}else
		{
			pw.println("<center><font color=red size=5>Sorry the username and password does not match. Please enter again</font></center>");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");			
			rd.forward(request, response);			
		}
		 }
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in Validate Demo : "+e);
		}
		
		
	}
	}


