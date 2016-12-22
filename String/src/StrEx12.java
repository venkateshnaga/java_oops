public class StrEx12 {

   public static void main(String args[]) {
      char[] Str1 = {'n', 'a', 'g', 'v', 'e', 'n', 'k', 'a', 't', 'e', 's', 'h'};
      String Str2 = "";
      Str2 = Str2.copyValueOf( Str1 );
      System.out.println("Returned String: " + Str2);
   }
}