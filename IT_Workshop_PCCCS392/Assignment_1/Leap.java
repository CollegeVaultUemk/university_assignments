import java.util.Scanner;

class LeapYear {

  public static void main(String[] args) {

    //Variable definition and assignment
    int year = 2016;
    boolean leap = false;
    Scanner obj = new Scanner(System.in); /* create a object */
    
  // Remove comments from the bottom lines to take input from the user
   System.out.print("Enter a year: ");
   year = obj.nextInt();

    //A year divisible by 4 is a leap year
    if (year % 4 == 0) {

      //It is a centenary year if the value is divisible by 100 with no remainder.
      if (year % 100 == 0) {

        //Centenary year is a leap year divided by 400
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    //The Year is not a leap year
    else
      leap = false;

    if (leap)
      System.out.println("Leap Year");
    else
     System.out.println("Not Leap Year");
  }
}
