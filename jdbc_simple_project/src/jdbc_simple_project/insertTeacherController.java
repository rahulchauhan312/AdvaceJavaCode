package jdbc_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class insertTeacherController {
	public static void main(String[] args) {
		Connection connection=null;
		// step 1 load or register driver

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step 2 Create Connection
			String url = "jdbc:mysql: //localhost:3306/jdbc-abc";
			String user = "root";
			String pass = "Rahul@2004";

			connection = DriverManager.getConnection(url, user, pass);

			/*
			 * step 3 Create Statement (we can Achieve in 3 ways 
			 * Statement,PreparedStatement,CallableStatement
			 */
			Statement statement=connection.createStatement();
			
			// step-4  ExecuteQuerry
	
			String insertTeacherQuery = "insert into teacher values(103,'Rahul','rrahul@gmail.com',9897845750,'Noida',12500)";	
			statement.execute(insertTeacherQuery);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}