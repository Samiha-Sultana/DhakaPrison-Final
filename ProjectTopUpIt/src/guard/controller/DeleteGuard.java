package guard.controller;

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

import guard.dao.guardDAO;
import guard.dao.impl.guardDaoImplement;
import guard.dao.impl.guardDaoImplement;
import guard.model.Guard;

/**
 * Servlet implementation class deleteGuard

 */
@WebServlet("/DeleteGuard")
public class DeleteGuard extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteGuard() {
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
 
  String Guard_ID=request.getParameter("Guard_ID");
  
 Guard guard=new Guard(Guard_ID,null,null);
  ServletContext sc=getServletContext(); //Interface 
  Connection con=(Connection)sc.getAttribute("connObj");//This lines for connection
  guardDaoImplement sdao=new guardDaoImplement(con);
  int update=sdao.deleteGuard(guard);
  pw.println("<center><h2>"+update+" Guard Record Deleted Successfully..</h2></center>");
  //request.getRequestDispatcher("guard.jsp").forward(request, response);
  RequestDispatcher rd=request.getRequestDispatcher("guard.jsp");//next page
  rd.include(request, response);
 }

}
