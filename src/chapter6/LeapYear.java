package chapter6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Insert a year that you think is a leap year");
        System.out.println("You can try 5 times");
        int tries = 5;

        while (tries > 0) {
            Scanner keyboardScanner = new Scanner(System.in);
            int year = keyboardScanner.nextInt();

            if (isLeapYear(year))
                System.out.println("Year " + year + " is a leap year");
            else
                System.out.println("Year " + year + " is NOT a leap year");

            tries--;
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
