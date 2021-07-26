/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    //main is for testing to make the program work
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String zipCode;
        String ID;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        firstName = input.nextLine();
        System.out.println("Enter the last name: ");
        lastName = input.nextLine();
        System.out.println("Enter the ZIP code: ");
        zipCode = input.nextLine();
        System.out.println("Enter the employee ID: ");
        ID = input.nextLine();

        String error = validateInput(firstName, lastName, zipCode, ID);
        System.out.println(error);
    }

    public static String validateInput(String firstName, String lastName, String zipCode, String ID) {
        String error = "";
        if (firstName.isEmpty()) {
            error += "This field is empty\n";
        } else if (firstName.length() < 2) {
            error += "The first name must be at least 2 characters long.\n";
        }
        if (lastName.isEmpty()) {
            error += "This field is empty\n";
        } else if (lastName.length() < 2) {
            error += "The last name must be at least 2 characters long.\n";
        }
        if (zipCode.isEmpty()) {
            error += "This field is empty\n";
        } else if (!isDigit(zipCode)) {
            error += "The zipcode must be an integer\n";
        } else if (zipCode.length() != 5) {
            error += "The zipcode must be a 5 digit number\n";
        }
        if (!validateID(ID)) {
            error += "The ID entered is not valid\n";
        }
        if (error.isEmpty()) {
            error += "There were no errors found\n.";
        }
        return error;
    }

    public static boolean isDigit(String string) {
        return ((string != null) && (!string.equals("") && (string.matches("^[0-9*#+.]+$"))));
    }

    public static boolean validateID(String ID) {
        // AA-1234
        return ID.matches("^([A-Za-z]){2}-([0-9]){4}$");
    }

}

