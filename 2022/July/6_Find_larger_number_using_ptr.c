#include <stdio.h>
#include <stdlib.h>
void main()
{
 int first,second,*ptr1=&first,*ptr2=&second;

   printf("Enter first number: ");
   scanf("%d", ptr1);
   printf("Enter second number: ");
   scanf("%d", ptr2); 

   if(*ptr1>*ptr2) {
    printf("\n\n %d is the maximum number.\n\n",*ptr1);
    }

    else {
    printf("\n\n %d is the maximum number.\n\n",*ptr2);
    }

}
