import java.io.*;

class StrEx15
{

   public static void main(String args[]) 
   {
      String Str = new String("Dhatri Info Solutions");
      
      //System.out.println("Value :" );      
      
      for (String splitvalue: Str.split(""))
      {
         System.out.println(splitvalue);
      }
   }
}