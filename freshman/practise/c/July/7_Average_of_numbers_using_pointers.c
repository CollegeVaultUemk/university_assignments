#include<stdio.h>
int main() {
    int firstNo,secondNo,avg,sum,*firstNumber=&firstNo,*secondNumber=&secondNo,*average=&avg, *addition=&sum;
    printf("Enter first number: ");
    scanf("%d", firstNumber);
    printf("Enter second number: ");
    scanf("%d", secondNumber);
    *addition = *firstNumber + *secondNumber;
    *average = *addition / 2;
    printf("Average is %d", *average);
    return 0;
}