package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Cp 
{
		// TODO Auto-generated method stub
		static Connection con;
		   public static Connection create() throws SQLException
		   {
			  
			   try 
			   {
				   //load the driver
				   Class.forName("com.mysql.jdbc.Driver");
				   
				   //create the connection
				   String user="root";
				   String password="AnudipA";
				   String url="jdbc:mysql://localhost:3306/student_manage";
				   con=DriverManager.getConnection(url,user,password);
			   } 
			   catch (ClassNotFoundException e) 
			   {
				   e.printStackTrace();
			   }
			   
			   return con;
		   }
		

}
