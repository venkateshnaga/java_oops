class ExceptionExa
{
	int j;
	int i[]=new int[2];
	A a;
	public void functionOne() throws ArithmeticException, ArrayIndexOutOfBoundsException,NullPointerException
	{
		j=1/i[0];
		i[2]=5;
		a.i=j;
	}
	public static void main(String[] args)
	{
		ExceptionExa e=new ExceptionExa();
		try
		{
			e.functionOne();
		}
		catch(ArithmeticException e1)
		{
			System.out.println("this is a value which is divided by 1");
		}
		catch(NullPointerException np)
		{
			System.out.println("Obj Creation is not done");
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Arry size limit is 2");
		}
	}
}
class A
{
	int i,j;
}