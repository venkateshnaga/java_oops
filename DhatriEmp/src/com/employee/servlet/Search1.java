package com.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.bean.EmployeeBean;
import com.employee.dbo.Dboperations;

/**
 * Servlet implementation class Search1
 */
@WebServlet("/Search1")
public class Search1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String searchElement=request.getParameter("dropdown");
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
			    pageEncoding="ISO-8859-1"%>
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>
			<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Insert title here</title>
			</head>
			<body align="center">
			<form action="Search1" method="post">
			View By EmployeeId|Name|Salary:
			<select name="dropdown">
			 <option value="id">Id</option>
			<option value="name">Name</option>
			<option value="sal">Salary</option>
			</select>
			<input type="text" name="emp"/>
			<input type="submit" value="submit"/>
			</form>
			</body>
			</html>
		String temp=request.getParameter("emp");
		
		if(searchElement.equals("id"))
		{
			
			double id;
			id=Double.parseDouble(temp);
			Dboperations dbo=new Dboperations();
			
			ArrayList<EmployeeBean> empList=dbo.search(id);
			
			HttpSession session=request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis=request.getRequestDispatcher("viewsucess.jsp");
			
			requestDis.forward(request, response);
			
			/*RequestDispatcher requestDis=request.getRequestDispatcher("viewid.jsp");
			
			requestDis.forward(request, response);*/
		
		}
		
		else if(searchElement.equals("name"))
		 
		{
			Dboperations dbo=new Dboperations();
			
			
			ArrayList<EmployeeBean> empList=dbo.searchname(temp);
			
			HttpSession session=request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis=request.getRequestDispatcher("viewsucess.jsp");
			
			requestDis.forward(request, response);	
		/*	RequestDispatcher requestDis=request.getRequestDispatcher("viewname.jsp");
			requestDis.forward(request, response);*/
			
		}
		else if(searchElement.equals("sal"))
			 
		{
			double salary;
			Dboperations dbo=new Dboperations();
			salary=Double.parseDouble(temp);
			
			ArrayList<EmployeeBean> empList=dbo.searchsal(salary);
			
			HttpSession session=request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis=request.getRequestDispatcher("viewsucess.jsp");
			
			requestDis.forward(request, response);	
			
			
			/*RequestDispatcher requestDis=request.getRequestDispatcher("viewsal.jsp");
			
			requestDis.forward(request, response);*/
		}
		
	}

}
