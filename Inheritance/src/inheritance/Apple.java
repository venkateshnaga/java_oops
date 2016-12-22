package inheritance;

class Orange {
	double x, y;
	public void functionOne(double x, double y)
	{
		this.x=x+y;
		this.y=this.x+this.x;
	}
}

class Banana extends Orange
{
	double x, y;
	public void functionTwo(double x,double y)
	{
		this.x=x+y;
		this.y=x*y;
	}
}
class Papple extends Banana
{
	double x;
	public void display()
	{
		System.out.println("x value ="+x);
		System.out.println("y value ="+y);
	}
	public static void main(String[] args)
	{
		Papple pa=new Papple();
		pa.functionOne(2.5,3.5);
		pa.display();
		Banana ba=new Banana();
		ba.functionTwo(4.0,5.0);
		System.out.println(pa.x);
		System.out.println(pa.y);
		System.out.println(ba.x);
		System.out.println(ba.y);
	}
}