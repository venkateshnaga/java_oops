import java.util.*;
 
class Factorial
{
   public static void main(String args[])
   {
      int a, b, fact = 1;
 
      System.out.println("Enter the Value");
      Scanner sc = new Scanner(System.in);
 
      a = sc.nextInt();
 
      if ( a < 0 )
          System.out.println("Error");
       else
       {
         for ( b = 1 ; b <= a ; b++ )
         
            fact = fact*b;
 
         System.out.println("Factorial of "+a+" is = "+fact);
       }
   }
}