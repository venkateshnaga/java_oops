import java.util.*;
class Taskemp 
{
	//int eId;
	//String eName;
	public void insert()
	{
	System.out.println("Enter the no of emp");

	}
	public static void main(String[] args)
	{

	Taskemp temp1=new Taskemp();
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	System.out.println("Select One Choice");
	System.out.println("1.Insert an Emp");
	System.out.println("2.Delete an Emp");
	System.out.println("3.Update an Emp");
	System.out.println("4.Exit");
	int i=sc.nextInt();
	switch (i)
	{
	case 1:
		System.out.println("Enter no of emp's");
		Employee[] emp=new Employee[sc1.nextInt()];
		Employee emp1 = null;
		for(int z=0;z<emp.length;z++)
		{
			System.out.println("Enter the emp details");
			emp1=new Employee();
			emp1.eId=sc1.nextInt();
			emp1.eName=sc1.next();
		}

		//System.out.println(emp1.eId[]);
		
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
