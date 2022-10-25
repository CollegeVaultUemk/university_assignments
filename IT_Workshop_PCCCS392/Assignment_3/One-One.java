// Implementation of method overloading
// By changing number of parameters

import java.io.*;
class Addition {
    public int add (int a, int b) {
        int sum = a+b;
        return sum;
    }
    public int add (int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int sum = obj.add(1,2);
        System.out.println("Sum of two integer value: " +sum);
        sum = obj.add(1,2,3);
        System.out.println("Sum of three integer value: " +sum);
    }
}