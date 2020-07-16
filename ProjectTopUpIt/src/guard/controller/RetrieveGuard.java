package guard.controller;

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

/**
 * Servlet implementation class RetrieveGuard
 
 */
@WebServlet("/RetrieveGuard")
public class RetrieveGuard extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveGuard() {
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
  guardDAO sdao=new guardDaoImplement(con);
  List<Guard> guardList=sdao.retrieveGuard();
  request.setAttribute("guardlist", guardList);
  request.getRequestDispatcher("viewGuard.jsp").forward(request, response);
   
 }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }

}
