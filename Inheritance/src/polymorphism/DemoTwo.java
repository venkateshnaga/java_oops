package polymorphism;
//Example for Overriding
class DemoOn {
	int x, y;
	static float f1,f2;
	static boolean flag;
	public float functionOne(float f1, float f2)
	{
		DemoOn.f1=f1+f2;
		DemoOn.f2=DemoOn.f1+f2;
		return DemoOn.f2+f1;
	}
	public int functionOne(float f1)
	{
		DemoOn.f1=f1+f2;
		f1=DemoOn.f1+f1;
		return (int)f1;
	}
	public static DemoOn functionOne(int x)
	{
		DemoOn done=new DemoOn();
		done.x=done.functionOne(x+1.0f);
		f1=done.functionOne((float)x, f1);
		return done;
	}
}
class DemoTwo extends DemoOn
{
	public float functionOne(float f1, float f2)
	{
		DemoOn.f1=f1+DemoOn.f1;
		DemoOn.f2=f1;
		return DemoOn.f1+DemoOn.f2;
	}
	public static void main(String[] args)
	{
		DemoTwo dtwo=new DemoTwo();
		float d1=dtwo.functionOne(2.0f, f2);
		float d2=dtwo.functionOne(d1, d1+d1);
		System.out.println(d1);
		System.out.println(d2);
		DemoOn done=new DemoTwo();
		float f1=done.functionOne(2.0f);
		float f2=done.functionOne(f1, f1+f1);
		System.out.println(f1);
		System.out.println(f2);
	}
}