import java.util.*;
class StrEx8
{  
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String Value"); 
		String str=sc.next();
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="venky";
		String s5="venky";
		System.out.println(str.equals(s2));
		System.out.println(str.equals(s3));
		System.out.println(s5==s4); 
		
		StringBuffer sb= new StringBuffer("venky");
		StringBuffer sb1=new StringBuffer("venky)");
		System.out.println(sb.equals(sb));
		System.out.println(sb==sb1);
	}
}
