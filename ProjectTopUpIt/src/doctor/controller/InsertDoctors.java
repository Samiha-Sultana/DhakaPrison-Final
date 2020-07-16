package doctor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBconnection.DBConnList;
import doctor.dao.DoctorDAO;
import doctor.dao.impl.DoctorDAOImpl;
import doctor.model.Doctors;


/**
 * Servlet implementation class InsertDoctors
 */
@WebServlet("/InsertDoctors")
public class InsertDoctors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDoctors() {
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
		String National_ID=request.getParameter("Doctor_ID");
		String Prisoner_ID=request.getParameter("Doctor_Name");
		String Prisoner_Name=request.getParameter("Prisoner_ID");
		
		
		Doctors doctors=new Doctors(National_ID,Prisoner_ID,Prisoner_Name);
		
		ServletContext sc=getServletContext();
		Connection con=(Connection)sc.getAttribute("connObj");
		DoctorDAO sdao=new DoctorDAOImpl(con);
		boolean status=sdao.insertPrisoner(doctors);
		//if 
		//9oper==true)
		//status=true;
		System.out.println(status);

		
		if(status==true)
		{
			pw.println("<center><h2>Doctor Record Inserted Successfully..</h2></center>");
			RequestDispatcher rd=request.getRequestDispatcher("clinic.jsp");
			rd.include(request, response);
		}
		else
		{
			pw.println("<center><h2>Doctor Record Insertation Failed..</h2></center>");
			RequestDispatcher rd=request.getRequestDispatcher("clinic.jsp");
			rd.include(request, response);
			
		}
		
	}

}
