package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    Random random = new Random();

    public static void main(String[] args) {
        App winner = new App();
        winner.printWinner();

    }
    public ArrayList<String> getList(){
        var people = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            System.out.print("Enter a name: ");
            Scanner person = new Scanner(System.in);
            var name = person.nextLine();
            if (name.matches(" ") || name.length() == 0){
                break;
            }
            people.add(name);
        }

        return people;
    }

    public void printWinner(){
        var people = getList();
        if (people.size() > 0){
            var prize = chooseWinner(people);
            System.out.printf("The winner is...%s.%n", prize);
        }
    }

    public String chooseWinner(List<String> people){
        int ofList = random.nextInt(people.size());
        return people.get(ofList);
    }
}
