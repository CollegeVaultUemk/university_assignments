package p4;

public class D {
    public static void main(String[] args) {
        try{
            int a[] = new int [5];
            a[5] = 30/0;
        } catch (ArithmeticException e){
            System.out.println("Caught arithmetic expression.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Index Out of Bound Expression.");
        } catch (Exception e) {
            System.out.println("Caught parent exception.");
        }
    }
}
