package p8;

public class K {
    public static void main(String[] args) {
        try {
            int data=100/10;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled.");
        } finally {
            System.out.println("Finally executed.");
        }
    }
}
