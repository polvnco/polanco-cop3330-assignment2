package ex30;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App object = new App();
        object.multiplicationTable();
    }

    public void multiplicationTable() {
        Scanner tableSize = new Scanner(System.in);
        int tableGenerator = tableSize.nextInt();
        if (tableGenerator > 12 || tableGenerator < 1){
            System.out.print("Please enter a number between 1 - 12.");
            return;
        }
        System.out.println();

        for (int i = 1; i <= tableGenerator; i++) {
            for (int j = 1; j <= tableGenerator; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}
