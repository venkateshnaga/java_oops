package basics;
//Executing constructor with the help of this keyword
public class TDemo {
TDemo()
{
	this(2);
	System.out.println("Default Constructor");
}
TDemo(int i)
{
	this(2,3);
	System.out.println("one argument constructor"+i);
}
TDemo(int i, int j)
{
	System.out.println("two arguments"+(i+j));
}
public static void main(String[] args){
	TDemo t= new TDemo();
}
}
