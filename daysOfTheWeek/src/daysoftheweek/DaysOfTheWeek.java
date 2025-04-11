package daysoftheweek;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {
        // Read in an integer.
        // Display the corresponding day-of-the-week in German.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        if (num == 1) {
            System.out.println("1. =Montag");
        } else if (num == 2) {
            System.out.println("2. = Dienstag");
        } else if (num == 3) {
            System.out.println("3. = Mittwoch");
        } else if (num == 4) {
            System.out.println("4. = Donnerstag");
        } else if (num == 5) {
            System.out.println("5. = Freitag");
        } else if (num == 6) {
            System.out.println("6. = Samtag");
        } else if(num == 7){
            System.out.println("7. = Sonntag");
        } else{
            System.out.println("Not part of the list of numbers.");
        }

    }

}
