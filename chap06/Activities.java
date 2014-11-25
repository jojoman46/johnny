package chap06;

import java.util.Scanner;

public class Activities {
final static int SWIM = 80;
final static int TENNIS = 60;
final static int GOLF = 40;
    public static void main(String[] args) {
        int temperature;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the temperature (degrees Fahrenheit): ");
        temperature = scan.nextInt();
        
        if (temperature < 20 || temperature > 95) {
            System.out.println("Visit our shops!");
        }else if (temperature >= 80) {
            System.out.println("Go Swimming!");
        }else if (temperature > 80 && temperature >=60) {
            System.out.println("Go Play Tennis!");
        }else if (temperature < 80 && temperature >= 40) {
            System.out.println("Go Golfing!");
        }else if (temperature < 40) {
            System.out.println("Go Skiing!");
        }
    }
}
