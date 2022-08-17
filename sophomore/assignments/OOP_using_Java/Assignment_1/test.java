import java.util.Scanner;
class Factorial{
	public static void main (String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number: ");
		int n = sc.nextInt();
		int f = fact(n);
		System.out.printf("Factorial: %d", f);
	}
	public static int fact (int n){
		if (n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
}
