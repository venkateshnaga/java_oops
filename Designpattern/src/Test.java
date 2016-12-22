class Singleton
{
private static Singleton singleobj=new Singleton();
private Singleton()
{
	System.out.println("hello");
}
public static Singleton getInstance()
{
	return singleobj;
}
public void display()
{
	System.out.println("singleton class");
}
}
public class Test 
{
	public static void main(String[] args) 
	{
		Singleton.getInstance().display();
	}
}
