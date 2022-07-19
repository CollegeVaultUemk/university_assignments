#include<stdio.h>
int main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    if (number / 1 == number)
    {
        if (number / number == 1)
        {
            printf("%d is a prime number.", number);
        }
        else
        {
            printf("%d is not a prime number.", number);
        }
    }
    else
    {
        printf("%d is not a prime number.", number);
    }
    return 0;
}