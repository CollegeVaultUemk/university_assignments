public class CallByValue{
    public static void main(String[] args){
       int a = 30;
       int b = 45;
       System.out.println("Before swapping, a = " + a + " and b = " + b);
       // Invoke the swap method
       swapFunction(a, b);
    }
    public static void swapFunction(int a, int b) {
       // Swap n1 with n2
       int c = a;
       a = b;
       b = c;
       System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }
 }