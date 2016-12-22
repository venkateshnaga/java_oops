import java.util.*;
public class Arraylist
{
	public static void main(String[] args) 
	{
		
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(new Employee(111,"naga"));
		a.add(new Employee(222,"hari"));
		a.add(new Employee(333,"venky"));
		a.add(new Employee(111,"h"));
		a.add(null);
		
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			Employee ee=(Employee)it.next();
			//for(Employee ee:a)
			System.out.println(ee.eid+"------"+ee.ename);
		}
		
	}
}
