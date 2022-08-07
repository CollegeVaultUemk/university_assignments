#include<stdio.h>
int main() {
    // sum of n natural numbers using while loop
    int n, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    int i = 1;
    while (i <=n)
    {
        sum += i;
        i++;
    }
    printf("Sum of %d natural numbers is %d.", n, sum);
}