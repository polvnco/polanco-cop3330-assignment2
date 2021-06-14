/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex31;

import java.util.Scanner;

public class App {

    int total = 0;

    public static void main(String[] args) {
        App object = new App();
        object.karvonenHeartRate();
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getTotal(){
        return this.total;
    }

    public void karvonenHeartRate(){
        System.out.print("What is your age? ");
        Scanner ageNum = new Scanner(System.in);
        int age = ageNum.nextInt();


        System.out.print("What is your resting heart rate? ");
        Scanner hRate = new Scanner(System.in);
        int heartRate = hRate.nextInt();

        System.out.printf("Resting Pulse: %d        Age: %d\n", heartRate, age);
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        for (var intensity = 55; intensity <= 95; intensity += 5){
            var goalHeartRate = calcTargetHeartRate(age, heartRate, intensity);
            System.out.printf("%2d%%          | %d bpm%n", intensity, goalHeartRate);
        }
    }

    private static int calcTargetHeartRate(int age, int heartRate, int intensity){
        var calc1 = 220 - age;
        var calc2 = calc1 - heartRate;
        var calc3 = intensity / 100.0;
        var calc4 = calc2 * calc3;
        var total = calc4 + heartRate;

        return (int) total;
    }
}
