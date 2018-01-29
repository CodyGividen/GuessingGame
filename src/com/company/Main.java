package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. allow user input of a number(guess)
        //2. tell the user if their guess is to high or top low
        //3. allow for 5 chances, is the number isn't guessed tell them what it is
        //4. if the number is guessed, congratulate them
        //5. and ask if they would like to play again.

        Scanner input = new Scanner(System.in);

        int numberOfGuess = (0);
        int userGuess = input.nextInt();
        final int MAX_GUESS_COUNT = 4;

        int randonumber = (int) Math.ceil(Math.random() * 100);
        do {
            do {
                System.out.println("Enter Your Guess:");
                if (userGuess > randonumber) {
                    System.out.println("your number is to high");
                    numberOfGuess = (numberOfGuess + 1);
                } else if (userGuess < randonumber) {
                    System.out.println("Your number is too low!");
                    numberOfGuess = (numberOfGuess + 1);
                } else if (userGuess == randonumber) {
                    System.out.println("You guessed the correct number!!");
                } else if (numberOfGuess >= MAX_GUESS_COUNT) {
                    System.out.println("Sorry, you have ran out of chances. The correct number was:" + randonumber);
                }
            } while (numberOfGuess == 5);
            System.out.println("Would you like to play again? 200 for Yes, 300 for No");
                if (userGuess == 300) {
                    System.exit(0);
                }else if(userGuess == 200) {
                    numberOfGuess = (numberOfGuess - 4);
                    }
        }while (numberOfGuess <= MAX_GUESS_COUNT) ;
    }
}