import java.util.*; 
class StrEx10
 {  
public static void main(String args[])
{  
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String value");
	String s1=sc.next();
	char[] ch=s1.toCharArray();  
	for(int i=0;i<ch.length;i++){  
	System.out.print(ch[i]);
	//System.out.println(s1.length());
  }  
 }
}  