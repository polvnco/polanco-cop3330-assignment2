/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex37;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    Random random = new Random();
    private static final List<Character> alphabet = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    private static final List<Character> specialCharacters = List.of('!', '@', '#', '$', '%', '^', '&', '*', '+', '?');
    private static final List<Character> numbers = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');


    public static void main(String[] args) {
        App generatorPW = new App();
        generatorPW.passwordGenerator();
    }

    public void passwordGenerator(){
        System.out.print("What's the minimum length? ");
        Scanner minL = new Scanner(System.in);
        var length = minL.next();

        System.out.print("How many special characters? ");
        Scanner special = new Scanner(System.in);
        var specialCharCount = special.next();

        System.out.print("How many numbers? ");
        Scanner minNum = new Scanner(System.in);
        var numberCount = minNum.next();

        var createdPassword = 0; // this generates the password from the inputs

    }

    public int integers(String input){
        return Integer.parseInt(input);

    }

    public String passwordBuilder(int length, int specialCharCount, int numberCount){

        return "t";
    }
}
