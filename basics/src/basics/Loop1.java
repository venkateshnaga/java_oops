package basics;

public class Loop1 {
int[] i=new int[3];
static int j;
public void insertion(){
	for(int k=0;k<=2;k++){
		i[k]=k;
		j=k+i[k];
	}
	int i=2;
	while(i>=0){
		i[i]=i+i;
		i--;
	}
	do{
		System.out.println("do while");
		i++;
	}while(i<=0);
}
public static void main(String[] args){
	Demo demo=new Demo();
	demo.insertion();
	if(j<demo.i[0]){
		System.out.println(j+"value is .....");
	}
	if(j>demo.i[i]){
		System.out.println("j is greater");
	}
	else{
		System.out.println("j is ......");
	}
	if(demo.i[0]>j){
		System.out.println(demo.i[0]+"is greater");
	}
	else if(demo.i[1]>j){
		System.out.println(demo.i[1]+"is greater");
		else{
			System.out.println(j+"is greater");
		}
	}
}
}
