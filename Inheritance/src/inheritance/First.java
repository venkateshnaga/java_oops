package inheritance;
// Example for Single Level Inheritance
class First
{
	int x,y;
	public void functionOne(int x, int y)
	{
		this.x=x+y;
		this.y=this.x+this.x;
	}

}
class Six extends First
{
	public void display()
	{
		System.out.println("x value="+x);
		System.out.println("y value="+y);
	}
	public static void main(String[] args)
	{
		Six sc=new Six();
		sc.functionOne(2, 3);
		sc.display();
		First f=new First();
		f.functionOne(5, 10);
		System.out.println("x value="+f.x);
		System.out.println("y value="+f.y);
	}
}
