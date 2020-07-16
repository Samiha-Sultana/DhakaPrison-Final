package executioner.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import executioner.dao.PrisonerExecutionerDAO;
import executioner.dao.impl.PrisonerExecutionerDAOImpl;
import executioner.model.PrisonersExecutioner;

/**
 * Servlet implementation class RetrieveExecutioner 
 */
@WebServlet("/RetrieveExecutioner")
public class RetrieveExecutioner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveExecutioner () {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext sc=getServletContext();
		Connection con=(Connection)sc.getAttribute("connObj");
		PrisonerExecutionerDAO sdao=new PrisonerExecutionerDAOImpl(con);
		List<PrisonersExecutioner> prisonersList=sdao.retrieveExecutioner();
		request.setAttribute("prisonerlist", prisonersList);
		request.getRequestDispatcher("viewExecutioner.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
