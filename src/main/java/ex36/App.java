/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        App stats = new App();
        stats.compStats();
    }

    public void compStats(){
        var responseTimes = new ArrayList<Long>();

        while (true) {
            System.out.print("Enter a number: ");
            Scanner readInput = new Scanner(System.in);
            var line = readInput.next();
            if ("done".equals(line)) {
                break;
            } else if (checkInt(line)) {
                responseTimes.add(Long.parseLong(line));
            }
        }

        if (responseTimes.size() > 0) {
            var average = average(responseTimes);
            var minimum = min(responseTimes);
            var maximum = max(responseTimes);
            var standardDeviation = standardDeviation(responseTimes);

            printResponseTimes(responseTimes);
            System.out.printf("The average is %d.%n", average);
            System.out.printf("The minimum is %d.%n", minimum);
            System.out.printf("The maximum is %d.%n", maximum);
            System.out.printf("The standard deviation is %.2f.%n", standardDeviation);
        }

    }
    private static void printResponseTimes(ArrayList<Long> responseTimes) {
        System.out.print("Numbers: ");
        IntStream.range(0, responseTimes.size()).mapToObj(i -> responseTimes.get(i) + (i < responseTimes.size() - 1 ? ", " : "")).forEach(System.out::print);
        System.out.println();
    }

    public long average(ArrayList<Long> input){
        var amount = 0;
        for (int i = 0; i < input.size(); i++) {
            Long value = input.get(i);
            amount += value;
        }
        return amount / input.size();
    }

    public long max(ArrayList<Long> input){
        var max = input.get(0);
        for (int i = 0, inputSize = input.size(); i < inputSize; i++) {
            Long value = input.get(i);
            max = max < value ? value : max;
        }
        return max;
    }

    public long min(ArrayList<Long> input){
        var min = input.get(0);
        for (int i = 0, inputSize = input.size(); i < inputSize; i++) {
            Long value = input.get(i);
            min = min > value ? value : min;
        }
        return min;
    }

    public double standardDeviation(ArrayList<Long> input){
        var mean = average(input);

        var sum = 0;
        var newMean = 0;
        for (Long value : input) {
            sum += (long) Math.toIntExact(value);
            System.out.println(sum);
        }
        var currentMean = (long) sum;
        System.out.println(currentMean);
        return Math.sqrt(newMean);
    }
    private static boolean checkEmpty(String string) {
        if (string == null) return true;
        return string.length() == 0;
    }

    private static boolean checkInt(String string) {
        if (checkEmpty(string)) {
            return false;
        }
        char[] charArray = string.toCharArray();
        for (char character : charArray) {
            if (!Character.isDigit(character)) {
                return false;
            }
        }
        return true;
    }


}
