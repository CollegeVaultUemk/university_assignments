// Write a Java program to check whether a number is prime or not
import java.util.Scanner;

class Prime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    boolean isPrime = true;
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println("The number is prime");
    } else {
      System.out.println("The number is not prime");
    }
  }
}