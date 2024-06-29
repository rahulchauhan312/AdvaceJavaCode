package jdbc_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudentAddress {
	public static void main(String[] args) {
		Connection connection=null;
		//step-1 Load or Register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create Connection
			String url="jdbc:mysql: //localhost:3306/jdbc-abc";
			String userName = "root";
			String pass = "Rahul@2004";
			connection = DriverManager.getConnection(url, userName, pass);
			//create Statement
			Statement statement = connection.createStatement();
			String UpdateQuery= "update student join(select id from student where Length(id)=2) as subquery on student.id=subquery.id set student.address='Noida';";
			//step-4 execute statement
			int a=statement.executeUpdate(UpdateQuery);
			String msg=a==1?"Updated Query": "Invalid";
			System.out.println(msg);
		} catch (ClassNotFoundException  | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
