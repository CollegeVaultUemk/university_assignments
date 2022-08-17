import java.util.Scanner;

class Armstrong{
	public static void main(String args[]){
		int ars, save, sum=0, num=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		ars = sc.nextInt();
		save = ars;
		while(num !=0){
			num = ars%10;
			ars= ars/10;
			sum = sum+(num*num*num);
		}
		if(save==sum){
			System.out.print("\nArmstrong number");
		}
		else{
			System.out.print("\nNot Armstrong");
		}
		sc.close();
	}
}