#include <stdio.h>
#include <stdlib.h>
int main()
{
    FILE *fp1,*fp2;
    char ch;
    fp1=fopen("abc.txt","r");
    fp2=fopen("xyz.txt","w");
    if(fp1==NULL)
    {
        printf("Error while opening a file for reading");
        return 0;
    }
    if(fp2==NULL)
    {
        printf("Error while opening a file for reading");
        return 0;
    }
    while((ch=fgetc(fp1))!=EOF)
    {
        fputc(ch,fp2);
    }
    printf("File is Successfully Copied");
    fclose(fp1);
    fclose(fp1);
    return 0;
}