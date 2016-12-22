import java.io.*;
class BufferExample {
  public static void main(String[] args) throws IOException
  {
	  BufferedReader objRef=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter the Id");
	  String rId=objRef.readLine();
	  Integer i1=new Integer(rId);
	  int id=i1.intValue();
	  System.out.println("Enter the name");
	  String name=objRef.readLine();
	  System.out.println("Enter the salary");
	  String rSal=objRef.readLine();
	  double sal=Double.parseDouble(rSal);
	  System.out.println("Id="+id);
	  System.out.println("Name="+name);
	  System.out.println("Salary="+rSal);
	  
  }
}
