package abstraction;

abstract class Calculator
{
	int a,b;
	public int sum(int a, int b)
	{
		this.a=a;
		this.b=b;
		return this.a+this.b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public abstract int mul(int a, int b);
	public abstract int div(int a,int b);
}
class Cal extends Calculator
{
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
}
	class Test
	{
		public static void main (String[] args)
		{
			Cal c=new Cal();
			System.out.println(c.sum(10,20));
			System.out.println(c.sub(10,20));
			System.out.println(c.mul(10,20));
			System.out.println(c.div(10,20));
		}
	}