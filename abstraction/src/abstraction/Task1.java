package abstraction;
class Task1
{
	//private int Empid;
	
	int i , j;
	static double d1, d2;
	public double function(int i, int j)
	{
		this.i=i+j;
		j=this.i=j;
		return (int)(i+j);
	}
	public void function(int i)
	{
		i=this.i=i;
		d1=(double)i;
	}
	public void function(double d1)
	{
		this.d1=d1+d2;
	}
	
	Task1()
	{
		this.i=10;
		this.j=30;
		return ;
	}
	
}
	class Task2 extends Task1
	{
		//private float Empsalary;
		static long l1, l2;
		public static long functionOne(long l1, long l2)
		{
			Task2 t=new Task2();
			Task1.d2=l2+t.function(4, 5);
			Task1.d1=(double)(l1+l2);
			return (int)(Task1.d1*Task1.d2);
		}
		
		
		
	}
	class Task3 extends Task2
	{
		float f1;
		long mnc;
		Task3()
		{
			super();
		}
		public static void main(String[] args)
		{
			Task3 ts=new Task3();
			ts.function(5);
			long mnc=Task2.functionOne(10,5);
			System.out.println(d1);
			System.out.println(mnc);
		}
		
	}
