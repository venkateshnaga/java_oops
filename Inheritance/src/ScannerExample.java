import java.util.*;
class ScannerExample {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Id");
	   int id=sc.nextInt();
	   System.out.println("Enter the Name");
	   String name=sc.next();
	   System.out.println("Enter the Salary");
	   float sal=sc.nextFloat();
	   System.out.println("Id="+id+" "+"Name="+name +" "+"Salary="+sal);
   }
}
