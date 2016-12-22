package polymorphism;
// Example for overloading
class DemoOne {
	int x, y;
	static float f1,f2;
	static boolean flag;
	public float functionOne(float f1, float f2)
	{
		DemoOne.f1=f1+f2;
		DemoOne.f2=DemoOne.f1+f2;
		return DemoOne.f2+f1;
	}
	public int functionOne(float f1)
	{
		DemoOne.f1=f1+f2;
		f1=DemoOne.f1+f1;
		return (int)f1;
	}
	public static DemoOne functionOne(int x)
	{
		DemoOne done=new DemoOne();
		done.x=done.functionOne(x+1.0f);
		f1=done.functionOne((float)x, f1);
		return done;
	}
	public static int functionOne(DemoOne d)
	{
		return d.x+d.y;
	}
	public static void main(String[] args){
		DemoOne done=functionOne(5);
		int k= functionOne(done);
		System.out.println(k);
		System.out.println(f1);
		System.out.println(f2);
	}
}
