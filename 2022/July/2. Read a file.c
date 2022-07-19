// Program to read the content of a text file and display it.

#include<stdio.h>

int main() {
    // Declare the pointer
    FILE *fp;
    // Declare a char data type to store data from the file.
    char ch;
    // Make the pointer open the file.
    fp = fopen("file.txt", "r");
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