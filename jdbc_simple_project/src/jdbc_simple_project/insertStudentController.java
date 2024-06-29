package jdbc_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertStudentController {
	public static void main(String[] args) {
		Connection connection = null;
		// step-1 Load or Register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc-abc";
			String userName = "root";
			String pass = "Rahul@2004";
			connection = DriverManager.getConnection(url, userName, pass);
			//step-3 Create statement
			Statement statement=connection.createStatement();
			//step-4 executeQuery
			String insertStudentQuery = "insert into student values(1020,'sohan','sohan@gmail.com','noida');";
			statement.execute(insertStudentQuery);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		;
	}
}
