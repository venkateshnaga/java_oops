package abstraction;

interface Abc
{
	int k=0;
	public void function();
	public static final float pi=3.14f;
	public abstract void functionOne(int x, int y);
}
abstract class Example implements Abc
{
	public void function()
	{
	System.out.println("k="+k);
	System.out.println("pi="+pi);
}
}
class ExampleOne extends Example
{
	public void functionOne(int x,int y)
	{
		x=x+k;
		y=(int)pi+x;
	}
	public static void main(String[] args)
	{
		ExampleOne eo=new ExampleOne();
		eo.functionOne(2,5);
		eo.function();
	}
}