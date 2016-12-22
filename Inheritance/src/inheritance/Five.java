package inheritance;
// Example for Multi-Level Inheritance
class Four
{
	int x,y;
	public void functionOne(int x, int y)
	{
		this.x=x+y;
		this.y=this.x+this.x;
	}

}
class Third extends Four
{
	int x,y;
	public void functionTwo(int x,int y)
	{
		this.x=x+y;
		this.y=x*y;
	}
}
class Five extends Third
{
	int x;
	public void display()
	{
		System.out.println("x value="+x);
		System.out.println("y value="+y);
	}
	public static void main(String[] args)
	{
		Five fv=new Five();
		fv.functionOne(2, 3);
		fv.display();
		Third t=new Third();
		t.functionTwo(5,7);
		System.out.println("x value="+fv.x);
		System.out.println("y value="+fv.y);
		System.out.println("t value of x="+t.x);
		System.out.println("t value of y="+t.y);
	}
}
