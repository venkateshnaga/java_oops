package basics;
//Example for toString

class Stack {
Stack s= new Stack();
int i;

public String toString(){
	return "STACK Class ref";
}
public static void main(String[] args){
	Stack s1=new Stack();
	s1.i=10;
	System.out.println(s1.i);
	System.out.println(s1);
	
}
}
