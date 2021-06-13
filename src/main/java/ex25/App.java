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
        App object = new App();
        object.passwordValidator();

    }

    public  void passwordValidator() {

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

        System.out.println(very_strongPassword);
    }

    public  String callParser() {
        System.out.print("ENTER A PASSWORD: ");
        Scanner pw = new Scanner(System.in);
        return pw.nextLine();
    }

    public  boolean vwPassword(String pass) {
        return pass.length() < 8 && int_check(pass);
    }
    public  boolean wPassword(String pass) {
        return pass.length() < 8 && char_check(pass);
    }
    public  boolean sPassword(String pass) {
        if (pass.length() >= 8 && char_check(pass))
        {
            return int_check(pass);
        }
        return true;
    }
    public  boolean vsPassword(String pass) {
        return isSpecial(pass);
    }


    public  boolean int_check(String pass) {
        char c;
        for (int i = 0; i < pass.length(); i++) {
            c = pass.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public  boolean char_check(String pass) {
        char c;
        for (int i = 0; i < pass.length(); i++) {
            c = pass.charAt(i);
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public  boolean isSpecial(String pass){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(pass);
        return matcher.find();

    }
}