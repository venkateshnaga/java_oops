package com.ss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner input=new Scanner(System.in);
		
		Employee employeeBean=new Employee();
		
		System.out.println("enter employee Id");
		employeeBean.setEmployeeId(input.nextInt());
		System.out.println("enter employee name");
		employeeBean.setEmployeeName(input.next());
		System.out.println("enter employee salary");
		employeeBean.setEmployeeSlary(input.nextDouble());
		System.out.println("enter employee location");
		employeeBean.setEmployeeLoc(input.next());
		System.out.println("enter empl oyee exp");
		employeeBean.setEmployeeExp(input.nextDouble());
		/*System.out.println("enter employee loan");
		employeeBean.setEmployeeLoan(input.nextDouble());*/
		

		
		DataBaseOperations dbo=new DataBaseOperations();
		
		
		/*int result=dbo.insertData(employeeBean);
*/		
		int result=dbo.insertDataUsingPrepared(employeeBean);
		System.out.println(result+ " data inserted");
		
	
	  
		System.out.println("enter employee Id to search");
		  int employeeId=input.nextInt();
		
		  ArrayList<Employee> listOfEmp=  dbo.search(employeeId);
		
		  Iterator<Employee> itr=listOfEmp.iterator();
		  
		  System.out.println("Id \t Name \t salary \t location \t exp \t");
		  while(itr.hasNext())
		  {
			Employee emp=(Employee)itr.next();
			  
			  System.out.println(emp.getEmployeeId()+"\t"+emp.getEmployeeName()+"\t"+emp.getEmployeeSlary()+"\t"+emp.getEmployeeLoc()+"\t"+emp.getEmployeeExp()+"\t");
		  }
		  
		  /*
		  System.out.println("enter employee Id to delete");
			int empId=input.nextInt();
			dbo.delete(empId);
			
			  	System.out.println("enter employee Id to update");
				int empID=input.nextInt();
				System.out.println("Enter Employee Name to update");
				String empName=input.next();
				System.out.println("Enter Employee Salary to update");
				double empSal=input.nextDouble();
				System.out.println("Enter Employee Location to update");
				String empLoc=input.next();
				System.out.println("Enter Employee Experience to update");
				double empExp=input.nextDouble();

				dbo.update(empName,empSal,empLoc,empExp,empID);*/

				System.out.println("enter employee Id to apply for loan");
				int employeeid=input.nextInt();
				dbo.loan(employeeid);

		}

}
