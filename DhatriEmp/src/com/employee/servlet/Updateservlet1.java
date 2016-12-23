package com.employee.servlet;

import java.io.IOException;
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
 * Servlet implementation class Updateservlet1
 */
@WebServlet("/Updateservlet1")
public class Updateservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateservlet1() {
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
		String tempid=request.getParameter("search");
		double id;
		id=Double.parseDouble(tempid);
		Dboperations dbo=new Dboperations();
		
		
		ArrayList<EmployeeBean> empList=dbo.search(id);
		
		HttpSession session=request.getSession();
		session.setAttribute("employeeList", empList);
		RequestDispatcher requestDis=request.getRequestDispatcher("updateview.jsp");
		
		requestDis.forward(request, response);
		
	}

}
