package encapsulation;

public class Aadhar
	{
	private String AadharNo;
	private String AadharName;
	public void setAadharNo(String AadharNo)
	{
		this.AadharNo=AadharNo;
	}
	public void setAadharName(String AadharName)
	{
		this.AadharName=AadharName;
	}
	public String getAadharNo()
	{
		return AadharNo;
	}
	public String getAadharName()
	{
		return AadharName;
	}
	}
	class Test{
		public static void main(String[] args){
			Aadhar a= new Aadhar();
			a.setAadharNo("12345");
			a.setAadharName("Venkhatesh");
			System.out.println("Your Aadhar No="+a.getAadharNo());
			System.out.println("Your Aadhar Name="+a.getAadharName());
		}
	}
