/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex28;

import java.util.Scanner;

public class App {

    int total = 0;

    public static void main( String[] args)
    {
        App object = new App();
        object.addingNumbers();
    }

    public int getTotal(){
        return this.total;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public void addingNumbers(){
        int total = 0;
        for (int i = 0; i < 5; i++ ){
            System.out.print("Enter a number: ");
            Scanner num = new Scanner(System.in);
            int number = num.nextInt();
            total += number;
        }
        System.out.println("The total is " + total + ".");
    }

}
