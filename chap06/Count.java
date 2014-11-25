package chap06;

//************************************************************
//Count.java
//
//This program reads in strings (phrases) and counts the
//number of blank characters and certain other letters
//in the phrase.
//************************************************************
import java.util.Scanner;
public class Count
{
public static void main (String[] args)
{
String phrase = ""; // a string of characters
int countBlank, countA, countE, countS, countT; // the number of blanks (spaces) in the phrase
int length; // the length of the phrase
char ch; // an individual character in the string
Scanner scan = new Scanner(System.in);
//Print a program header
System.out.println ();
System.out.println ("Character Counter");
System.out.println ();
//Read in a string and find its length
while (!phrase.equalsIgnoreCase("quit")){
System.out.print ("Enter a sentence or phrase, or type \"quit\" to quit: ");
phrase = scan.nextLine();
if (phrase.equalsIgnoreCase("quit")) {
}
length = phrase.length();
//Initialize counts
countBlank = 0;
countA = 0;
countE = 0;
countS = 0;
countT = 0;
//a for loop to go through the string character by character
//and count the blank spaces

    for (int i = 0; i < length; i++) {
        ch = phrase.charAt(i);
        switch (ch){
        case ' ': countBlank++;
        break;
        case 'a':
        case 'A': countA++;
        break;
        case 'e':
        case 'E': countE++;
        break;
        case 's':
        case 'S': countS++;
        break;
        case 't':
        case 'T': countT++;
        break;
    }
}

//Print the results
System.out.println ();
System.out.println ("Number of blank spaces: " + countBlank);
System.out.println ("Number of A's: " + countA);
System.out.println ("Number of E's: " + countE);
System.out.println ("Number of S's: " + countS);
System.out.println ("Number of T's: " + countT);
System.out.println ();

}
scan.close();
}
}