package prisonerType2.controller;

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

import prisonerType2.dao.prisonerType2DAO;
import prisonerType2.dao.impl.prisonerType2DaoImplement;
import prisonerType2.model.PrisonerType2;


/**
 * Servlet implementation class InsertPrisonersExecution
 */
@WebServlet("/InsertPrisonerType2")
public class InsertPrisonerType2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPrisonerType2() {
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
		String National_ID=request.getParameter("National_ID");
		String Prisoner_ID=request.getParameter("Prisoner_ID");
		String Prisoner_Name=request.getParameter("Prisoner_Name");
		String  Entry_Date=request.getParameter("Entry_Date");
		String  Execution_Date=request.getParameter("Execution_Date");
		String  Address=request.getParameter("Address");
		String  Crime_Name=request.getParameter("Crime_Name");
		
		PrisonerType2 prisoner=new PrisonerType2(National_ID,Prisoner_ID,Prisoner_Name, Entry_Date,Execution_Date,Address,Crime_Name);
		
		ServletContext sc=getServletContext();
		Connection con=(Connection)sc.getAttribute("connObj");
		prisonerType2DAO sdao=new prisonerType2DaoImplement(con);
		boolean status=sdao.insertPrisoner(prisoner);
		//if 
		//9oper==true)
		//status=true;
		System.out.println(status);

		
		if(status==true)
		{
			pw.println("<center><h2>Prisoner Record Inserted Successfully..</h2></center>");
			RequestDispatcher rd=request.getRequestDispatcher("prisonerType2.jsp");
			rd.include(request, response);
		}
		else
		{
			pw.println("<center><h2>Prisoner Record Insertation Failed..</h2></center>");
			RequestDispatcher rd=request.getRequestDispatcher("prisonerType2.jsp");
			rd.include(request, response);
			
		}
		
	}

}
