#include<stdio.h>
#include<conio.h>
#include<string.h>
int main(){
    char a[50];
    char temp;
    printf("Enter string: ");
    scanf("%s",a);
    int length = strlen(a);
    int length2 = strlen(a)-1;
    int i;
    for (i=0; i < length2/2 ; i++)
    {
        temp=a[i];
        a[i]=a[length];
        a[length--]=temp;
    }

    printf("\nReverse string: %s", a);

    return 0;
}