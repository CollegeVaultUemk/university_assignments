// Check if a number is palindrome
import java.util.Scanner;

class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int reverse = 0;
    while (number != 0) {
      reverse = reverse * 10 + number % 10;
      number /= 10;
    }
    if (number == reverse) {
      System.out.println("The number is palindrome");
    } else {
      System.out.println("The number is not palindrome");
    }
  }
}