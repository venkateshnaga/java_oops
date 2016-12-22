package Square;

public class Spilt {
	
	public static void main(String[] args)
	{
		String A = "Selenium-tool-is-an-AutomationTool";
		String [] tool = A.split("-");
		
		for(int i=0;i<A.length();i++)
		{
			System.out.println("value for "  + i + " is " + tool[i]);
			
			
		}
	}
}