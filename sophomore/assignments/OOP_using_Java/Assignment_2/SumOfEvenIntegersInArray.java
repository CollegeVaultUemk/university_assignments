// Write a Java program to find the sum of even numbers in an integer array.
class SumOfEvenIntegersInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}