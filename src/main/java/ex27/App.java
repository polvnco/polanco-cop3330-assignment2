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
        App validateinput = new App();
        validateinput.validateInput();
    }

    public void validateInput(){
        userFirstName();
        userLastName();
        userZipCode();
        userEmpID();
    }

    public void userFirstName() {
        System.out.print("Enter first name: ");
        Scanner fName = new Scanner(System.in);
        if (fName.equals("")) {
            System.out.println("First name required.\nEnter first name:");
        }
        fName.nextLine();
    }

    public void userLastName() {
        System.out.print("Enter last name: ");
        Scanner lName = new Scanner(System.in);
        lName.nextLine();
    }

    public void userZipCode() {
        System.out.print("Enter the zip code: ");
        Scanner zip = new Scanner(System.in);
        String zipCode = zip.nextLine();
        //noinspection LoopStatementThatDoesntLoop * introduce while statement
        for (int i = 0; i < zipCode.length(); i++) {
            if (Character.isDigit(zipCode.charAt(i))) {
                return;
            } else if (Character.isWhitespace(zipCode.charAt(i))) {
                System.out.println("Enter the zip code:");
                zip.next();
                return;
            } else {
                System.out.print("The zip code must contain numeric values only.\nEnter the zip code: ");
                zip.next();
                return;
            }
        }
    }

    public void userEmpID() {
        System.out.print("Enter an employee ID: ");
        Scanner id = new Scanner(System.in);
        String empID = id.nextLine();
        String flag;
        if (!Pattern.matches("[a-zA-Z]{2}[-][0-9]{4}", empID)) {
            flag = "The employee ID must be in the format of AA-1234.";
            System.out.println(flag);
        }
        else
            return;
    }

    }

