import java.util.*;
class Task
{
	private int Empid;
	
	int i , j;
	static double d1, d2;
	public double function(int i, int j)
	{
		this.i=i+j;
		j=this.i=j;
		return (int)(i+j);
	}
	public void function(int i)
	{
		i=this.i=i;
		d1=(double)i;
	}
	public void function(double d1)
	{
		this.d1=d1+d2;
	}
	public void setEmpid(int Empid)
	{
		this.Empid=Empid;
	}
	public void setEmpsalary(float Empsalary){
		this.Empsalary=Empsalary;
	}
	Task()
	{
		this.i=10;
		this.j=30;
	}
	
}
	class Tasks extends Task
	{
		private float Empsalary;
		static long l1, l2;
		public static void functionOne(int l1, int l2)
		{
			d2=l2+function(4, 5);
			Task.d1=(double)(l1+l2);
		}
		public int getEmpid()
		{
			return Empid;
		}
		public int getEmpsalary()
		{
			return Empsalary;
		}
		
	}
	class Taskss extends Tasks
	{
		float f1;
		Taskss()
		{
			super();
		}
		public static void main(String[] args)
		{
			Taskss ts=new Taskss();
			ts.function(5);
			Tasks.functionOne(10, 5);
			System.out.println(d1);
		}
		
	}
