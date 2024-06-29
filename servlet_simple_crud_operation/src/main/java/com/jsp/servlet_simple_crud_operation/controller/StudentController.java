package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.jsp.servlet_simple_crud_operation.dao.StudentDao;
import com.jsp.servlet_simple_crud_operation.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class StudentController implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDao Dao=new StudentDao();
		String name=req.getParameter("username");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		String degree = req.getParameter("degree");
		String branch = req.getParameter("branch");
		String  gender = req.getParameter("gender");
		Student s = new Student(name,email,pass, degree, branch, gender);
		Student s2= Dao.saveStudentDao(s);
		System.out.println(s2);
		System.out.println(s2.getName());
		PrintWriter printwriter= res.getWriter();
		if(s2!=null) {
			printwriter.write("<html><body><h3 'style=color: green'; >Register Successfully</h3></body></html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("loginpage.jsp");
			dispatcher.include(req, res);
			
		}
//		else {
//			printwriter.write("<html><body><h3 'style=color: red'; >Not Registered</h3></body></html>");
//			RequestDispatcher dispatcher = req.getRequestDispatcher("Student_register.jsp");
//			dispatcher.include(req, res);
//		}
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
