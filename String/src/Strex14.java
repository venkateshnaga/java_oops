import java.io.*;
public class Strex14 {

   public static void main(String args[]) {
      String Str = new String("Dhatri Info Dhatri Solutions");

      System.out.print("Return Value :" );
      System.out.println(Str.replace('o', 'T'));

      System.out.print("Return Value :" );
      System.out.println(Str.replace('c', 'D'));
   
   
      System.out.print("Return Value :" );
      System.out.println(Str.replaceAll("Dhatri", "Venky"));
      
      
      System.out.print("Return Value :" );
      System.out.println(Str.replaceFirst("Dhatri", "Venky"));
   
   
   }
}