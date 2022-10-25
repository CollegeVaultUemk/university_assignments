package p3;

// Case 2: Exception created and handled properly
public class B {
    public static void main(String[] args) {
        try {
            int data = 100/0;
        } catch (Exception e) {
            System.out.println("Denominator can't be zero.");
        }
    }
}
