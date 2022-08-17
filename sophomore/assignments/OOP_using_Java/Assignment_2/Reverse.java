// Reverse a number input from user
import java.util.Scanner;

class Reverse {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int reverse = 0;
    while (number != 0) {
      reverse = reverse * 10 + number % 10;
      number /= 10;
    }
    System.out.println("Reverse of the number is: " + reverse);
  }
}