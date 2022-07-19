#include<stdio.h>
void swap(int *x, int *y){
    int t;
    t = *x;
    *x = *y;
    *y = t;
}
int main(){
    int firstNumber, secondNumber;
    printf("Enter value of first number: ");
    scanf("%d",&firstNumber);
    printf("Enter value of second number: ");
    scanf("%d",&secondNumber);
    printf("Before swapping:\n");
    printf("First nunber: %d and Second number: %d\n", firstNumber,secondNumber);
    swap (&firstNumber,&secondNumber);
    printf("After swapping:\n");
    printf("First number: %d and Second number: %d", firstNumber,secondNumber);
    return 0;

}