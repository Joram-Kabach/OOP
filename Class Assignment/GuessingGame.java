package com.joramkabach;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner myInt = new Scanner(System.in);
        System.out.print("Enter number between 1 and 5:");

        int guess = myInt.nextInt(); // read user input
        if (guess >= 1 && guess <= 5) {
            int result = guess % 2;
            if (result == 0) {
                System.out.println("Lucky Guess");
            } else {
                System.out.println("Better Luck Next Time");
            }
        } else {
            System.out.print("Enter number between 1 and 5:");
            guess = myInt.nextInt();
        }
    }
}


