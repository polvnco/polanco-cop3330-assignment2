/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex26;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        int numMonths = (int) PaymentCalculator.calculateMonthsUntilPaidOff();
        System.out.println("It will take you " + numMonths + " months to pay off this card.");
    }

    public static double callBalance() {
        Scanner balance = new Scanner(System.in);
        System.out.print("What is your balance? ");
        return balance.nextDouble();
    }

    public static double callInterestRate() {
        Scanner interest = new Scanner(System.in);
        System.out.print("What is the APR on the card (as a percent)? ");
        return interest.nextDouble();
    }
    public static double callPayment() {
        Scanner payment = new Scanner(System.in);
        System.out.print("What is the monthly payment you can make? ");
        return payment.nextDouble();
    }

    public static class PaymentCalculator{
        public static double calculateMonthsUntilPaidOff(){
            double b = callBalance();
            double i = callInterestRate() / 365 / 100;
            double p = callPayment();
            double calc1 = Math.pow((1 + i), 30);
            double calc2 = 1 - calc1;
            double calc3 = calc2 * (b / p);
            double calc4 = 1 + calc3;
            double calc5 = Math.log(calc4) / Math.log(1 + i);
            return Math.ceil((-1.00 / 30) * calc5);
        }
    }
}


