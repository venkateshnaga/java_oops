package basics;

public class Sample {
	int i,j;
	static float f1, f2;
	static boolean flag;
	public int functionOne(float f1, float f2)
	{
		i=(int)f1;
		j=i+(int)f2;
		return i+j;
	}
	public void functionTwo()
	{
		int k;
		k=functionOne(f1, f2);
		System.out.println("k value="+k);
		
	}
	public static float functionThree(int i, int j)
	{
		return i+j;
	}
	public static void main(String[] args)
	{
		Sample sam=new Sample();
		sam.f1=functionThree(2,5);
		sam.f2=sam.f1+f1;
		sam.functionTwo();
		System.out.println("f1 value="+f1);
		System.out.println("f2 value="+f2);
		if(sam.i > sam.j)
		{
			sam.flag= true;
		}
		else
			sam.flag=false;
		if(flag)
		{
			System.out.println("hai");
		}else
				System.out.println("hello");		
		}
	}
	

	

