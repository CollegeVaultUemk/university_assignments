package p3;

// Exception created but not properly handled.
public class C {
    public static void main(String[] args) {
        try {
            int data = 100/10;
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
