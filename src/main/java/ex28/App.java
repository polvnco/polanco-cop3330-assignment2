package ex28;

import java.util.Scanner;

public class App {

    public static void main( String[] args)
    {
        App object = new App();
        object.addingNumbers();
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
