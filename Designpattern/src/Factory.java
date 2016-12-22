import java.util.Scanner;

interface Shape
{
	public void draw();
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("rectangle shape drawn");
	}
}
class Traingle implements Shape
{
	public void draw()
	{
		System.out.println("traingle shape drawn");
	}
}
class Shapeimp
{
	public static Shape getType(String draw)
	{
		if(draw==null){
			return null;
		}
		else if(draw.equals("rectangle"))
		{
			return new Rectangle();
		}
		else if(draw.equals("triangle"))
		{
			return new Traingle();
		}
		return null;
	}
}
public class Factory 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Rectangle \n2.Traingle");
		System.out.println("Enter Your Choice");
		switch(sc.nextInt())
		{
		case 1:
			Shape s=Shapeimp.getType("rectangle");
			s.draw();
			break;
	case 2: Shape s1=Shapeimp.getType("triangle");
			s1.draw();
			break;
		}
	}
}
