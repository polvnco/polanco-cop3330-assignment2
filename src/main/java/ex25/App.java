/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex25;


//import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int pass_strength = passwordValidator();

    }

    public static int passwordValidator() {

        String password = callParser();

        boolean very_weakPassword = vwPassword(password);
        boolean weakPassword = wPassword(password);
        boolean strongPassword = sPassword(password);
        //..strong password
        //..very strong password

        if (very_weakPassword) {
            System.out.print("The password " + password + " is a very weak password");
            return 1;
        }
        else if (weakPassword) {
            System.out.print("The password " + password + " is a weak password");
            return 1;
        }
        else if (strongPassword) {
            System.out.print("The password " + password + " is a strong password");
            return 1;
        } else {
            return 0;
        }
        }

    public static String callParser() {
        System.out.print("ENTER A PASSWORD: ");
        Scanner pw = new Scanner(System.in);
        return pw.nextLine();
    }

    public static boolean vwPassword(String pass) {
        return pass.length() < 8 && int_check(pass);
    }
    public static boolean wPassword(String pass) {
        return pass.length() < 8 && char_check(pass);
    }
    public static boolean sPassword(String pass) {
        return pass.length() >= 8 && (int_check(pass) && char_check(pass));
    }

    public static boolean int_check(String pass) {
        //compare character by character to integer value
        //if character is int boolean = true
        //if non int found boolean = false
        char c;
        for (int i = 0; i < pass.length(); i++) {
            c = pass.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean char_check(String pass) {
        //compare character by character to integer value
        //if character is int boolean = true
        //if non int found boolean = false
        char c;
        for (int i = 0; i < pass.length(); i++) {
            c = pass.charAt(i);
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}