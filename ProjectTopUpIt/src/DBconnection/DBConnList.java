package DBconnection;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Servlet implementation class DBConnList
 */
@WebListener
public class DBConnList implements ServletContextListener {
	
	Connection con=null;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBConnList() {
     
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
		 	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projecttopup", "root", "root");
		 	ServletContext sc=sce.getServletContext();
		 	sc.setAttribute("connObj", con);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in DB Conn : "+e);
		}		
    }

}
