package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.jsp.servlet_simple_crud_operation.dao.StudentDao;
import com.jsp.servlet_simple_crud_operation.dto.Student;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginStudentController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
		StudentDao dao=new StudentDao();
		String user = req.getParameter("email");
		String pass = req.getParameter("password");
		Student student=dao.fetchStudentByEmailForLogin(user);
		PrintWriter printwriter=res.getWriter();
		System.out.println(student);
		if(student!=null) { 
			if (student.getPass().equals(pass)) {
				  req.getRequestDispatcher("homepage.jsp").include(req, res);
			} else {
				printwriter.write("<html><body><h5>Password is incorrect</h5></body></html>");
				 req.getRequestDispatcher("loginpage.jsp").include(req, res);
			}
		}
		else {
			printwriter.write("<html><body><h5 style='color: red'>Email is incorrect</h5></body></html>");
			 req.getRequestDispatcher("loginpage.jsp").include(req, res);
		}
		
	}

}
