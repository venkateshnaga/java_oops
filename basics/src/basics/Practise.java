package basics;

public class Practise {
 float x, y;
 static long l1, l2;
 
Practise (float x, float y){
	this.x=x;
	this.y=y;
}
public float function(float x , float y){
	x= (long)(l1+l2);
	y= (long)(l1*l2);
	return x+y;
}
public static Practise function(long l1 ,long l2){
	Practise p= new Practise(3.1f, 5.3f);
	float k= p.function((float)l1,(float) l2);
	Practise.l1=Practise.l1+l1;
	Practise.l2=Practise.l2*l2;
	System.out.println("k Value="+k);
	return p;
}
public static void main(String[] args){
	Practise pc=Practise.function(5, 6);
	System.out.println("x value="+pc.x);
	System.out.println("y value="+pc.y);
	System.out.println("l1 value="+l1);
	System.out.println("l2 value="+l2);
	System.out.println("pc="+pc);
}
}