import java.util.*;
public class Linkedlist 
{
	public static void main(String[] args)
	{
		LinkedList<Employee> a=new LinkedList<Employee>();
		a.add(new Employee(111,"naga"));
		a.add(new Employee(222,"venky"));
		a.add(new Employee(111,"h"));
		a.add(new Employee(111,"h"));
		a.add(null);
		Iterator lt=a.iterator();
		while(lt.hasNext())
		{
			Employee ee=(Employee) lt.next();
			System.out.println(ee.eid+"---------"+ee.ename);
		
		}
		
	}
}
