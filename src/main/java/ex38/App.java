package ex38;

import java.util.ArrayList;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        App fValues = new App();
        fValues.filteringValues();
    }
    private boolean isInt(String string) {
        if (string.isEmpty()) {
            return false;
        }
        for (var c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    private boolean checkEven(int number) {
        return (number % 2) == 0;
    }

    public void filteringValues(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        var numbers = createSpace(input);
        var checkIfEven = filterEvenNumbers(numbers);
        System.out.printf("The even numbers are %s.%n", String.join(" ", checkIfEven));
    }

    private String[] createSpace(String input) {
        var arrayList = new ArrayList<String>();
        var stringBuilder = new StringBuilder();

        for (var character : input.toCharArray()) {
            if (character == ' ') {
                if (stringBuilder.length() > 0) {
                    arrayList.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            } else {
                stringBuilder.append(character);
            }
        }
        if (stringBuilder.length() > 0) {
            arrayList.add(stringBuilder.toString());
        }

        var outputString = new String[arrayList.size()];
        return arrayList.toArray(outputString);
    }

    private String[] filterEvenNumbers(String[] numbers) {
        var list = new ArrayList<String>();
        for (var number : numbers) {
            if (isInt(number) && checkEven(Integer.parseInt(number))) {
                list.add(number);
            }
        }

        var result = new String[list.size()];
        return list.toArray(result);
    }



}