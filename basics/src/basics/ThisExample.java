package basics;

public class ThisExample {

	long l1,l2;
	static double d1, d2;
	ThisExample(){
		d1=1.5;
		d2=d1+1.5;
	}
	ThisExample(long l1, long l2){
		this.l1=l1+l2;
		l2=this.l1;
		this.l2=l2+this.l1;
	}
	public double functionOne(double d1, double d2)
	{
		ThisExample.d1=d1+d2;
		ThisExample.d2=d2+ThisExample.d1;
		return d1+d2;
	}
	public static void main(String[] args)
	{
		ThisExample te1=new ThisExample();
		double d1=te1.functionOne(1.5, 1.5);
		ThisExample te2= new ThisExample((long)d1, 5);
		System.out.println("d1 value="+d1);
		System.out.println("d2 value="+d2);
		System.out.println("l1&l2 values in first object=" +(te1.l1+te1.l2));
		System.out.println("l1&l2 values in second object=" +(te2.l1+te2.l2));
	}
}
