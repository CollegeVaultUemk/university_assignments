// Java program to check whether a number is divisible by 5 or not
import java.util.*;
public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		if (number % 5 == 0) {
			System.out.println("Number is divisible by 5");
		} else {
			System.out.println(number + " is not divisible by 5");
		}
	}
}