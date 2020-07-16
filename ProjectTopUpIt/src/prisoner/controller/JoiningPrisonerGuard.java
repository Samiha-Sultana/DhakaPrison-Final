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

import guard.dao.guardDAO;
import guard.dao.impl.guardDaoImplement;
import guard.model.Guard;
import prisoner.dao.impl.PrisonerDAOImpl;
import prisoner.model.Prisoners;

/**
 * Servlet implementation class JoiningPrisonerGuard
 */
@WebServlet("/JoiningPrisonerGuard")
public class JoiningPrisonerGuard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoiningPrisonerGuard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Guard_ID=request.getParameter("Guard_ID");
		  
		 Guard guard=new Guard(Guard_ID,null,null);
		  ServletContext sc=getServletContext(); //Interface 
		  Connection con=(Connection)sc.getAttribute("connObj");//This lines for connection
		  PrisonerDAOImpl sdao=new PrisonerDAOImpl(con);
		  //int update=sdao.deleteGuard(guard);
		  //pw.println("<center><h2>"+update+" Guard Record Deleted Successfully..</h2></center>");
		  List<Prisoners> prisonerList=sdao.JoinretrievePrisoners(Guard_ID);
		  request.setAttribute("prisonerlist", prisonerList);
		  request.getRequestDispatcher("ShowJoinPrisonerGuard.jsp").forward(request, response);
		    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// response.setContentType("text/html");
		 // PrintWriter pw=response.getWriter();
		String Guard_ID=request.getParameter("Guard_ID");
		  
		 Guard guard=new Guard(Guard_ID,null,null);
		  ServletContext sc=getServletContext(); //Interface 
		  Connection con=(Connection)sc.getAttribute("connObj");//This lines for connection
		  PrisonerDAOImpl sdao=new PrisonerDAOImpl(con);
		  //int update=sdao.deleteGuard(guard);
		  //pw.println("<center><h2>"+update+" Guard Record Deleted Successfully..</h2></center>");
		  List<Prisoners> prisonerList=sdao.JoinretrievePrisoners(Guard_ID);
		  request.setAttribute("prisonerlist", prisonerList);
		  request.getRequestDispatcher("ShowJoinPrisonerGuard.jsp").forward(request, response);
		  //request.getRequestDispatcher("viewGuard.jsp").forward(request, response);
		  //RequestDispatcher rd=request.getRequestDispatcher("guard.jsp");//next page
		  //rd.include(request, response);
	}

}
