package admin.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.AdminDAO;
import admin.dao.impl.AdminDAOImplement;
import admin.model.Admin;


/**
 * Servlet implementation class RetriveAdmin
 */
@WebServlet("/RetrieveAdmin")
public class RetrieveAdmin extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveAdmin() {
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
  AdminDAO sdao=new AdminDAOImplement(con);
  List<Admin> adminList=sdao.retrieveAdmin();
  request.setAttribute("adminlist", adminList);
  request.getRequestDispatcher("viewAdmin.jsp").forward(request, response);
 }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }

}
