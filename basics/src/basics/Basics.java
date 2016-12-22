package basics;
// program on basics covered upto now
class Basics {

long l1,l2;
static double d1,d2;
Basics(long l1,long l2){
	this.l1=l1+l2;
	this.l2=l1*l2;
}
Basics(){
	this((long)d1, (long)d2);
	d1=l1;
	d2=l2;
}
public int functionOne(double d1, double d2)
{
	int k=(int)d1+(int)d2;
	return k;
}
public static double functionTwo(int i){
	Basics basics=new Basics();
	i=i+basics.functionOne(d1, d2);
	System.out.println(i);
	System.out.println(basics.l1);
	System.out.println(basics.l2);
	return 7.5;
}
public static void main(String[] args){
	Basics basics=new Basics();
	double d1=functionTwo(2);
	System.out.println(d1);
	System.out.println(basics.l1);
	System.out.println(basics.l2);
	System.out.println(basics);
}
}
