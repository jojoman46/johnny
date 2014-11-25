package chap06;

//************************************************************
//Dates.java
//
//Determine whether a 2nd-millenium date entered by the user
//is valid
//************************************************************
import java.util.Scanner;

public class Dates {
    
public static void main(String[] args) {
    
int month, day, year; //date read in from user
int daysInMonth; //number of days in month read in
boolean monthValid, yearValid, dayValid; //true if input from user is valid
boolean leapYear; //true if user's year is a leap year
Scanner scan = new Scanner(System.in);
//Get integer month, day, and year from user
System.out.println("Enter Month (January being 1 and December being 12), Day (1 - 31), "
        + "and Year in that order, \nseperated by spaces: ");
month = scan.nextInt();
day = scan.nextInt();
year = scan.nextInt();
//Check to see if month is valid
if (month >= 1 && month <= 12){
    monthValid = true;
} else {
    monthValid = false;
}
//Check to see if year is valid
if (year >= 1000 && month <= 1999){
    yearValid = true;
} else {
    yearValid = false;
}
//Determine whether it's a leap year
if ((year % 4) == 0 && (year % 100) != 0) {
    leapYear = true;
}else if ((year % 100) == 0 && (year % 400) == 0) {
    leapYear = true;
}else {
    leapYear = false;
}
//Determine number of days in month
if (month < 1 || month > 12){
    daysInMonth = 0;
} else if (month == 1 || month == 3 || month == 5 || month == 7 
        || month == 8 || month == 10 || month == 12){
    daysInMonth = 31;
} else if (month == 4 || month == 6 || month == 9 || month == 11) {
    daysInMonth = 30;
} else if (leapYear == true) {
    daysInMonth = 29;
} else {
    daysInMonth = 28;
}
//Use number of days in month to check to see if day is valid
if (day >= 1 && day <= daysInMonth) {
    dayValid = true;
} else {
    dayValid = false;
}
//Determine whether date is valid and print appropriate message
if (monthValid == true && dayValid == true && yearValid == true){
    if (leapYear == true){
        System.out.println("The date is valid and is a leap year.");
    } else {
        System.out.println("The date is valid and is not a leap year.");
    } 
        
    }else {
        System.out.println("The date is not valid.");
}
scan.close();
}
}