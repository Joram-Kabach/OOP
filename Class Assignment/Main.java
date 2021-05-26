package com.joramkabach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     ///////////////////////////////////////////////////////////////////////////////////////////////
        Student student1 = new Student("677890", "Networking", "William N", "M", 1999);

        student1.printDetails();


        student1.setName("Joram K");
        student1.setGender("F");
        student1.setDob(1992);
        student1.setCourse("DBMS");
        student1.setRegNo("122222");
        student1.printDetails();
////////////////////////////////////////////////////////////////////////////////////////////////
        char reply = 0;
        do {
            System.out.println("Enter a number between 1 and 5:");
            int guess;
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            int result = guess % 2;
            if (guess >= 1 && guess <= 5 && result == 0) {
                System.out.println("Lucky Guess");
                System.out.println("Would you like to try again? (reply y for YES and n for NO)");
                Scanner rpl = new Scanner(System.in);
                reply = rpl.next().charAt(0);
            } else if (guess >= 1 && guess <= 5 && result != 0) {
                System.out.println("Better luck next time");
                break;
            } else {
                System.out.println("Number should be between 1 and 5");
            }
        } while (reply == 'y');

        System.out.println("Thanks for using this app");

////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner myInt = new Scanner(System.in);
        int guess = myInt.nextInt();
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
    ///////////////////////////////////////////////////////////////////////////////////////////////
        ClassAccount a = new ClassAccount();
        a.showDetails();

    }

