package p8;
//TODO: add proper comments

public class I {
    public static void main(String[] args) {
        try {
            int data=25/5;
            System.out.println(data);
        } catch(NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
