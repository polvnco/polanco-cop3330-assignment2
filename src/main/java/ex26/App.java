/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex26;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        App apr = new App();
        apr.calculateMonthsUntilPaidOff();

    }

    public double callBalance() {
        Scanner balance = new Scanner(System.in);
        System.out.print("What is your balance? ");
        return balance.nextDouble();
    }

    public double callInterestRate() {
        Scanner interest = new Scanner(System.in);
        System.out.print("What is the APR on the card (as a percent)? ");
        return interest.nextDouble();
    }

    public double callPayment() {
        Scanner payment = new Scanner(System.in);
        System.out.print("What is the monthly payment you can make? ");
        return payment.nextDouble();
    }

    public void calculateMonthsUntilPaidOff() {
        var b = callBalance();
        var i = callInterestRate() / 365 / 100;
        var p = callPayment();
        var calc1 = Math.pow((1 + i), 30);
        var calc2 = 1 - calc1;
        var calc3 = calc2 * (b / p);
        var calc4 = 1 + calc3;
        var calc5 = Math.log(calc4) / Math.log(1 + i);
        var calc6 = Math.ceil((-1.00 / 30) * calc5);
        System.out.printf("It will take you %d months to pay off this card.", (int) calc6);
    }
}


