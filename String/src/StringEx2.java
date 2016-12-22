import java.lang.*;
import java.util.*;

class StringEx2
{

   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter String Value");
       String str = sc.next();
       
       int value = str.codePointBefore(1);
        
       System.out.println(value);
   }
}