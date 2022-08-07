#include<stdio.h>

struct student{
    char name[30];
    int enrolment;
    int marks;
    char city[30];
}stu[10];

int main()
{
   printf("Please enter the information below...");
   int i;
   for (i=0; i < 10; ++i)
   {
    printf("Enter student name:");
    fgets(stu[i].name, sizeof(stu[i].name), stdin);

    printf("\nEnter enrolment number:");
    scanf("%d",&stu[i].enrolment);

    printf("\nEnter student marks:");
    scanf("%d",&stu[i].marks);
    
    printf("\nEnter student city name: ");
    fgets(stu[i].city, sizeof(stu[i].city), stdin);
    }

    printf("\nDisplaying entered student information:");
    for(i=0; i < 10; ++i)
    {
        printf("\nStudent name: %s", stu[i].name);
        printf("\nStudent enrolment number: %s", stu[i].enrolment);
        printf("\nStudent marks: %d", stu[i].marks);
        printf("\nStudent city name: %s", stu[i].city);
    }

    return 0;
}