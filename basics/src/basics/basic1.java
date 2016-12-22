package basics;

class basic1 {
	int x,y;
	static float f1, f2 ;
	basic1 (int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int functionOne(int x, int y){
		f1=x + y;
		f2=x*y;
		return (int)(f1+f2);
	}
	public static basic1 functionOne(float f1, float f2)
	{
		basic1 demo= new basic1(2,5);
		int k= demo.functionOne((int)f1, (int)f2);
		basic1.f1=basic1.f1+f1;
		basic1.f2=basic1.f2+f2;
		System.out.println("k value=" +k);
		return demo;
	}
	public static void main(String[] args)
	{
		basic1 demoRef= basic1.functionOne(1.5f, 2.5f);
		System.out.println("x value=" +demoRef.x);
		System.out.println("y value=" +demoRef.y);
		System.out.println("f1 value=" +f1);
		System.out.println("f2 value=" +f2);
		System.out.println("demo reference value=" +demoRef);
	}
}
