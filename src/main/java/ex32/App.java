/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex32;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class App {
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        System.out.println();
        App object = new App();
        object.startGame();
    }

    private void startGame(){
        var count = 1;
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        Scanner lvl = new Scanner(System.in);
        int level = lvl.nextInt();

        System.out.print("I have my number. What's your guess? ");
        Scanner theGuess = new Scanner(System.in);
        int guess = theGuess.nextInt();

        var answer = randomNumber(level);

        while (guess != answer){
            count++;
            var cue = guessValidator(guess, answer);
            guess = getInt();
        }
    }

    private String guessValidator(int guess, int answer){
        if (guess == -1){
            return "Wrong guess. Guess again:";
        }
        return (guess < answer) ? "Too low. Guess again: " : "Too high. Guess again: ";
    }

    private static int getInt(){
        do {
            Scanner scanner = new Scanner(System.in);
            String cue = scanner.next();

            return Integer.parseInt(cue);
        } while (true);
    }

    private int randomNumber(int level){
        return ThreadLocalRandom.current().nextInt(1, (int) (Math.pow(10, level) + 1));

    }

}
