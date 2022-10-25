class Swap {
	static public void main (String args[]){
		int a = 2, b = 3;
		System.out.printf("Before: a=%d, b=%d",a,b);
		int temp = a; a = b; b = temp;
		System.out.printf("\nAfter: a=%d, b=%d",a,b);
	}

