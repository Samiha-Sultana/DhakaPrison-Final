package prisoner.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prisoner.dao.PrisonerDAO;
import prisoner.dao.impl.PrisonerDAOImpl;
import prisoner.model.Prisoners;
/**
 * Servlet implementation class UpdatePrisoners
 */
@WebServlet("/UpdatePrisoners")
public class UpdatePrisoners extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePrisoners() {
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

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	
		String National_ID=request.getParameter("National_ID");
		String Prisoner_ID=request.getParameter("Prisoner_ID");
		String Prisoner_Name=request.getParameter("Prisoner_Name");
		//int age=Integer.parseInt(request.getParameter("age"));
		String  Entry_Date=request.getParameter("Entry_Date");
		String  Release_Date=request.getParameter("Release_Date");
		String  Address=request.getParameter("Address");
		String  Crime_Name=request.getParameter("Crime_Name");
		String  Cell_No=request.getParameter("Cell_No");
		
		Prisoners prisoners=new Prisoners(National_ID,Prisoner_ID,Prisoner_Name, Entry_Date,Release_Date,Address,Crime_Name,Cell_No);
		
		ServletContext sc=getServletContext();
		Connection con=(Connection)sc.getAttribute("connObj");
		PrisonerDAO sdao=new PrisonerDAOImpl(con);
		int update=sdao.updatePrisoner(prisoners);
		pw.println("<center><h2>"+" Prisoner Record Updated Successfully..</h2></center>");
		RequestDispatcher rd=request.getRequestDispatcher("prisoner.jsp");
		rd.include(request, response);
	}

}
