/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex29;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        App object = new App();
        object.handlingBadInput();
    }

    public void handlingBadInput() {
        var rate = 0;

        while (true) {
            System.out.print("What is the rate of return? ");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (input.equals("0") || input.contains(" ") || input.matches("^[a-zA-Z]*$")) {
                System.out.println("Sorry. That's not a valid input.");
            } else {
                rate = Integer.parseInt(input);
                var years = 72 / rate;
                System.out.printf("It will take %d years to double your initial investment.%n", years);
                break;
            }
        }
    }


}
