import java.util.*;
class Maximum {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>b && a>c)
			System.out.printf("%d is maximum.", a);
		else if (b>a && b>c)
			System.out.printf("%d is maximum.", b);
		else
			System.out.printf("%d is maximum.", c);
	}
}
