package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.text.html.HTML;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InsertStudentController implements Servlet{

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
	       String name=req.getParameter("username");
	       String email=req.getParameter("email");
	       String phone=req.getParameter("phone");
	       String degree=req.getParameter("degree");
	       String branch=req.getParameter("branch");
	       String gender=req.getParameter("gender");
//		   System.out.println(name);
//		   System.out.println(email);
//		   System.out.println(phone);
//		   System.out.println(degree);
//		   System.out.println(branch);
//		   System.out.println(gender);
	       PrintWriter printWriter=res.getWriter();
	       printWriter.write(name);
	       RequestDispatcher dispatcher=req.getRequestDispatcher("Student_register.jsp"); 
//	       dispatcher.include(req, res);
	       dispatcher.forward(req, res);
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
