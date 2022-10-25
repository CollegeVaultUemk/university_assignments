package p6;

//Implement throw keyword
public class F {
    public static void checkAge(int age) {
        if (age<18) {
            throw new ArithmeticException("Access denied!");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
