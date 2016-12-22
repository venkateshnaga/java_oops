
import java.util.Scanner;
 
public class Palindrome1
{
 
public static void main(String[] args)
{
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		if(s1.equals(sb))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("string is Not Palindrome");
		}

	}
}