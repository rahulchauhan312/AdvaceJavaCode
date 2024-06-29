package jdbc_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayStudentAllData {
	public static void main(String[] args) {
		Connection connection=null;
		//step-1 Load or Register
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step-2  Create Connection
			String url = "jdbc:mysql: //localhost:3306/jdbc-abc";
			String user = "root";
			String pass = "Rahul@2004";

			connection = DriverManager.getConnection(url, user, pass);
			//step-3 Create Statement
			Statement statement=connection.createStatement();
			String SelectQuery = "select * from student where id in(select id from student where Length(id)=3)";
			//step-4 Execute Query
			ResultSet s=statement.executeQuery(SelectQuery);
			while(s.next()) {
				System.out.println(s.getInt("id"));
				System.out.println(s.getString("name")+" ");
				System.out.println(s.getString("email")+" ");
				System.out.println(s.getString("address")+" ");
			}
		}catch (ClassNotFoundException | SQLException e) {
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
