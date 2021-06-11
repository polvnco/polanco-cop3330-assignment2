/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex25;



import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) {
        passwordValidator();

    }

    public static void passwordValidator() {

        String password = callParser();

        boolean very_weakPassword = vwPassword(password);
        boolean weakPassword = wPassword(password);
        boolean strongPassword = sPassword(password);
        boolean very_strongPassword = vsPassword(password);

        if (very_weakPassword) {
            System.out.print("The password " + password + " is a very weak password");
        }
        else if (weakPassword) {
            System.out.print("The password " + password + " is a weak password");
        }
        else if (strongPassword && !very_strongPassword) {
            System.out.print("The password " + password + " is a strong password");
        }
        else if (very_strongPassword) {
            System.out.print("The password " + password + " is a very strong password");
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
        if (pass.length() >= 8 && char_check(pass))
        {
            return int_check(pass);
        }
        return true;
    }
    public static boolean vsPassword(String pass) {
        return isSpecial(pass);
    }


    public static boolean int_check(String pass) {
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
        char c;
        for (int i = 0; i < pass.length(); i++) {
            c = pass.charAt(i);
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecial(String pass){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(pass);
        return matcher.find();

    }
}