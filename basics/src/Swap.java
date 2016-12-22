
class Swap {
 
    public static void main(String a[]){
        int x = 50;
        int y = 90;
        System.out.println("Before swapping");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swaping");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}