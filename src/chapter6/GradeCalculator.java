package chapter6;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        System.out.println("Insert student's score");
        Scanner keyboardScanner = new Scanner(System.in);

        int grade = keyboardScanner.nextInt();

        if ((grade >= 90) && (grade <= 100)) {
            System.out.println("Student's grade is: A");
        } else if ((grade >= 80) && (grade <= 89)) {
            System.out.println("Student's grade is: B");
        } else if ((grade >= 70) && (grade <= 79)) {
            System.out.println("Student's grade is: C");
        } else if ((grade >= 60) && (grade <= 69)) {
            System.out.println("Student's grade is: D");
        } else if (grade < 60) {
            System.out.println("Student's grade is: F");
        }
    }
}