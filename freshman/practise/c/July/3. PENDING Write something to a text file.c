// Program to write data to a text file

#include<stdio.h>
int main() {
    // Declare the pointer
    FILE *fp;
    // Declare a char data type.
    char ch;
    // Make the pointer open the file in write mode.
    fp = fopen("file.txt", "w");
    // If cannot open file, throw error.
    if (fp == NULL) {
        printf("File not found");
        return 0;
    }
    // Read the file (character by character using while loop) and print the content.
    while ((ch = fgetc(fp)) != EOF) {
        printf("%c", ch);
    }
    fclose(fp);
    return 0;
}