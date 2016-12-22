import java.util.*;
class StrEx4
{
	public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First String Value");
		 String str=sc.next();
	     Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter Second String Value");
		 String str1=sc1.next();
		 String con=str.concat(" "+str1);   //String con=str1.concat(" "+str1); to print in reverse format
		 System.out.println(con);
		 
	 }
}