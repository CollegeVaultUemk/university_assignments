class Factorial {
	public static void main(String args[]){
		int i, factorial = 1;
		int number = 5;
		for (i = 1 ; i <= number ; i++){
			factorial = factorial * i;
		}
		System.out.println("Factorial:" +factorial);
	}
}
