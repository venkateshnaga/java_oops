package com.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		Dboperations dao=new Dboperations();
		EmployeeBean empbean=new EmployeeBean();
		PrintWriter out=response.getWriter();
	
		
		if(searchElement.equals("id"))
		{
			RequestDispatcher requestDis=request.getRequestDispatcher("viewid.jsp");
			
			requestDis.forward(request, response);
		
		}
		
		else if(searchElement.equals("name"))
		 
		{
			
			RequestDispatcher requestDis=request.getRequestDispatcher("viewname.jsp");
			requestDis.forward(request, response);
			
		}
		else if(searchElement.equals("sal"))
			 
		{
			RequestDispatcher requestDis=request.getRequestDispatcher("viewsal.jsp");
			
			requestDis.forward(request, response);
		}
		
	}

}
