import java.util.Scanner;
class StrEx5
{
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter String Value");
	String str=sc.next();
	 for(int i=0;i<str.length();i++)
	 {
		 System.out.println(str.codePointAt(i));
	 }
  }
}
