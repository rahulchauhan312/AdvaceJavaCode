package jdbc_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class YpdateTeacherController {
	private static final String UpdateQuery = null;

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
			String updateQuery="update teacher set mobile=99990000000 where id=102;";
			// step-4  ExecuteQuerry
	
			long a=statement.executeUpdate(updateQuery);
			String msg=a==1?"Data Updated":"Given Data is not found";
			System.out.println(msg);
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
