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

        final int MAX_GUESS_COUNT = 4;

        System.out.println("Enter Your Guess:");
        int userGuess = input.nextInt();

        int randonumber = (int) Math.ceil(Math.random() * 100);

            do {
                System.out.println("Enter Your Guess:");
                int userGuess = input.nextInt();
                
                if (userGuess > randonumber) {
                    System.out.println("your number is to high");
                    numberOfGuess = (numberOfGuess + 1);
                } else if (userGuess < randonumber) {
                    System.out.println("Your number is too low!");
                    numberOfGuess = (numberOfGuess + 1);
                }else if (userGuess == randonumber) {
                    System.out.println("You guessed the correct number!!");
                }else if (numberOfGuess == MAX_GUESS_COUNT){
                    System.out.println( "Sorry, you have ran out of chances. The correct number was:" + randonumber);
                }
            } while (numberOfGuess <= 4);
        }
    }