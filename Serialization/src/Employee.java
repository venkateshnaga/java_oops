import java.io.*;
class Employee implements Serializable
{
	int eId;
	String eName;
	double eSalary;
	public static void Serialization()throws Exception
	{
		Employee employee=new Employee();
		employee.eId=100;
		employee.eName="dhatri";
		employee.eSalary=25000.00;
		FileOutputStream fos=new FileOutputStream(new File("D:/serial1.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(employee);
		System.out.println("Serialization Done");
		}
	public static void deserialization()throws Exception
	{
		FileInputStream fis=new FileInputStream("D:/serial1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Employee emp=(Employee)obj;
		System.out.println("after deserialization");
		System.out.println("Id="+emp.eId);
		System.out.println("Name="+emp.eName);
		System.out.println("Salary="+emp.eSalary);
	}
	public static void main(String[] args)
	{
		try 
		{
			Serialization();
			//deserialization();
		} 
		catch (Exception e) 
		{
			System.out.println("");
		}
	}
	
}
