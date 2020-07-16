package prisonerType2.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

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
 * Servlet implementation class RetrievePrisoners 
 */
@WebServlet("/RetrievePrisonerType2")
public class RetrievePrisonerType2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrievePrisonerType2 () {
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
		prisonerType2DAO sdao=new prisonerType2DaoImplement(con);
		List<PrisonerType2> prisonersList=sdao.retrievePrisoners();
		request.setAttribute("prisonerlist", prisonersList);
		request.getRequestDispatcher("viewprisonertype2.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
