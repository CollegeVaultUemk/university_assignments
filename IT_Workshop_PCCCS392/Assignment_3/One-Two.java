// By changing data type for parameters
import java.io.*;
class Addition {
    public int add (int a, int b, int c) {
        int sum = a+b;
        return sum;
    }
    public double add (double a, double b, double c) {
        double sum = a+b+c;
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int sum2 = obj.add(1,2,3);
        System.out.println("Sum of three integer value: " +sum2);
        double sum3 = obj.add(1.0,2.0,3.0);
        System.out.println("Sum of three double value: " +sum3);
    }
}