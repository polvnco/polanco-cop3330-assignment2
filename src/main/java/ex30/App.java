/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex30;

import java.util.Scanner;

public class App {
    int tableSize = 0;

    public static void main(String[] args) {
        App object = new App();
        object.multiplicationTable();
    }

    public void setTableSize(int tableSize){
        this.tableSize = tableSize;
    }
    public int getTableSize(){
        return this.tableSize;
    }

    public void multiplicationTable() {
        System.out.print("Enter a number between 1 - 12 to generate a multiplication table: ");
        Scanner tableSize = new Scanner(System.in);
        int tableGenerator = tableSize.nextInt();
        if (tableGenerator > 12 || tableGenerator < 1){
            System.out.print("Please enter a number between 1 - 12.");
            return;
        }
        System.out.println();

        for (int i = 1; i <= tableGenerator; i++) {
            for (int j = 1; j <= tableGenerator; j++) {
                System.out.format("%5d", i * j);
            }
            System.out.println();
        }
    }
}
