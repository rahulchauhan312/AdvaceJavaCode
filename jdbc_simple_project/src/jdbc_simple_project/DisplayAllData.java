package jdbc_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayAllData {
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
			String selectQuery="Select * from teacher;";
			// step-4  ExecuteQuerry
	
			ResultSet s=statement.executeQuery(selectQuery);
			while(s.next()) {
				System.out.println(s.getInt("ID")+" ");
				System.out.println(s.getString("Name"));
				System.out.println(s.getString("email")+" ");
				System.out.println(s.getString("mobile")+ " ");
				System.out.println(s.getDouble("salary")+" ");
				System.out.println(s.getNString("address"));
				System.out.println();
				System.out.println("..........................................");
			}
			
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
