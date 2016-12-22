import java.util.*;
class StrEx11
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first String Value");
		String s1=sc.next();
		s1.concat("naga");
		System.out.println(s1);
		System.out.println();
		
		StringBuffer sb=new StringBuffer("naga");
		sb.append("venkatesh");
		System.out.println(sb);
	}
}