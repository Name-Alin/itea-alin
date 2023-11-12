package chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {

        System.out.println("Insert a number that you think is a prime number");
        Scanner keyboardScanner = new Scanner(System.in);
        int number = keyboardScanner.nextInt();
        printResults(isPrimeNumber(number), number);
    }

    private static List<Integer> primeNumbersUpTo(int number) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if (isPrimeNumber(i))
                primeNumbers.add(i);
        }
        return primeNumbers;
    }

    private static boolean isPrimeNumber(int number) {
        int isPrime = number % 2;
        return isPrime == 1;
    }

    private static void printResults(boolean primeNumber, int number) {
        if (primeNumber)
            System.out.println("Number " + number + " is a prime number");
        else
            System.out.println("Number " + number + " is NOT a prime number");

        System.out.println("And if you really want to know, all the prime numbers up to number " + number + " are: ");
        for (Integer integer : primeNumbersUpTo(number)) {
            System.out.print(integer + ", ");
        }
    }
}
