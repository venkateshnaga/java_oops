
import java.util.*;
public class Pascal {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	int i,j,k,num=1;
	for(i=0;i<n;i++)
	{
		for(k=n;k>i;k--)
			System.out.print(" ");
		num=1;
		for(j=0;j<=i;j++)
		{
			System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			
		}
		System.out.println();
	}
	
	}
}
