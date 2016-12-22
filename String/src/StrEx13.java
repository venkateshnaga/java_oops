import java.io.*;
class StrEx13
{

   public static void main(String args[]) {
      String Str = new String("Dhatri Info Solutions");
      String str1= new String("to");
      System.out.print("Return Value :" );
      System.out.println(Str.matches("(.*)Info(.*)"));

      System.out.print("Return Value :" );
      System.out.println(str1.matches("to info"));

      System.out.print("Return Value :" );
      System.out.println(Str.matches("Dhatri(.*)"));
   }
}