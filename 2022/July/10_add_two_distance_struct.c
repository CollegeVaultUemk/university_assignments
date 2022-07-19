#include<stdio.h>
struct Distance{
    int feet;
    int inch;
}d1,d2,result;

int main()
{
    // input first distance:
    printf("Enter first distance in feet: ");
    scanf("%d", &d1.feet);
    printf("Enter first distance in inch: ");
    scanf("%d", &d1.inch);

    printf("\n");

    // input second distance:
    printf("Enter second distance in feet: ");
    scanf("%d", &d2.feet);
    printf("Enter second distance in inches: ");
    scanf("%d", &d2.inch);

    // add the distances:
    result.feet = d1.feet + d2.feet;
    result.inch = d2.inch + d2.inch;

    // print the result:
    printf ("The added distance is %d feet %d inches", result.feet, result.inch);
    return 0;
}
