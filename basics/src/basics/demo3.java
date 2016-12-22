package basics;

public class demo3 {
	double d1, d2;
	static float f1, f2;
	
	demo3(double d1, double d2){
		this.d1=d1;
		this.d2=d2;
	}

	public double funtwo(double d1, double d2){
		f1=(float)(d1+d2);
		f2=(float)(d1*d2);
		return (f1+f2);
	}
	public static demo3 funtwo(float f1, float f2){
		demo3 naga= new demo3(2.5, 3.5);
		double k= naga.funtwo((double)f1,(double)f2);
		demo3.f1=demo3.f1+f1;
		demo3.f2=demo3.f2*f2;
		System.out.println("k value="+k);
		return naga;
	}
	public static void main(String[] args)
	{
		demo3 demoref=demo3.funtwo(5.0f,3.0f);
		System.out.println("d1 value="+demoref.d1);
		System.out.println("d2 value="+demoref.d2);
		System.out.println("f1 value="+f1);
		System.out.println("f2 value="+f2);
		System.out.println("demo3 reference="+demoref);
	}
	
}
