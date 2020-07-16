package prisoner.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

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
 * Servlet implementation class RetriveStudents
 */
@WebServlet("/RetrievePrisoners")
public class RetrievePrisoners extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrievePrisoners() {
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
		PrisonerDAO sdao=new PrisonerDAOImpl(con);
		List<Prisoners> prisonersList=sdao.retrievePrisoners();
		request.setAttribute("prisonerslist", prisonersList);
		request.getRequestDispatcher("viewPrisoners.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
