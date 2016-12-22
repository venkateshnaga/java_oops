import java.util.*;
public class Employee
{

	private int empId;
	private String empName;
	
	public Employee(int e, String n)
	{
		empId=e;
		empName=n;
	}
	 public int getempId()
	 {
	        return empId;
	 }
	    public String getempName()
	    {
	        return empName;

	    }

	public static void main(String[] args)
	{

	//Taskemp temp1=new Taskemp();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Select One Choice");
	System.out.println("1.Insert an Emp");
	System.out.println("2.Delete an Emp");
	System.out.println("3.Update an Emp");
	System.out.println("4.Exit");
	int i=sc.nextInt();
	switch (i)
	{
	case 1:
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter no of emp's");
		Employee[] array=new Employee[sc1.nextInt()];
		//Employee emp1 = null;
		for(int z=0;z<array.length;z++)
		{
			System.out.println("Enter the emp details");
			
			int e=sc1.nextInt();
			String n=sc1.next();
			array[i] = new Employee(e, n);
		}

	//	System.out.println(emp1.eId[]);
		
		break;
	case 2:
		System.out.println("hello");
		break;
	case 3:
		System.out.println("abcd");
		break;
	case 4:
		System.out.println("efgh");
		break;
		
	}
	

	}
	
}