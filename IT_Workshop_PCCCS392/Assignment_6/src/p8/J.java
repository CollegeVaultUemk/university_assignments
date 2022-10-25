package p8;
//TODO: add proper comments
public class J {
    public static void main(String[] args) {
        try {
            int data=25/0;
            System.out.println(data);
        } catch (NullPointerException e){
            System.out.println(e);
        } finally {
            System.out.println("Finally executed.");
        }
    }
}
