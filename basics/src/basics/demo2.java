package basics;

class demo2 {
	float f1 , f2;
	static long x, y;
 
	demo2(float f1, float f2)
	{
		this.f1=f1;
		this.f2=f2;
	}
	public float funOne(float f1, float f2)
	{
		x=(long)(f1+f2);
		y=(long)(f1*f2);
		return x+y;
	}
	public static demo2 funOne(long x, long y)
	{
		demo2 naga = new demo2(3.5f,5.5f);
		float k=naga.funOne((float)x,(float)y);
		demo2.x=demo2.x+x;
		demo2.y=demo2.y+y;
		System.out.println("k value=" +k);
		return naga;
	}
	public static void main(String[] args)
	{
		demo2 demoRe= demo2.funOne(5,8);
		System.out.println("f1 value=" +demoRe.f1);
		System.out.println("f2 value=" +demoRe.f2);
		System.out.println("x value=" +x);
		System.out.println("y value=" +y);
		System.out.println("demo reference value=" +demoRe);
	}
}
