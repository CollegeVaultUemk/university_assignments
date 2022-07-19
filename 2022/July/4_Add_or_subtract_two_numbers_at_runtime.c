// Program to add or subtract two numbers at runtime.

#include<stdio.h>
int main() {
    int first, second, add, sub;
    printf("Enter first number: ");
    scanf("%d",&first);
    printf("Enter second number: ");
    scanf("%d",&second);
    add = first + second;
    sub = first - second;
    printf("Addition of two numbers: %d\n",add);
    printf("Subtraction of two numbers: %d\n",sub);
    return 0;
}