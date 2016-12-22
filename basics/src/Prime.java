import java.util.*;
class Prime
{
	public static void main(String args[])
	{		
		int n, i, result;
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
			result=n%i;
			if(result==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	}
}