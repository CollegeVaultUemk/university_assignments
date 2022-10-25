package p5;

// Implementing java's nested try statement
public class E {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to divide by zero");
                int b = 39 / 0;
            } catch(ArithmeticException e) {
                System.out.println(e);
            }
            int a[] = new int[5];
            a[5]=4;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
