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
        System.out.print("Enter the amount of contestants: ");
        Scanner contestantsAmount = new Scanner(System.in);
        int cAmount = contestantsAmount.nextInt();
        var people = new ArrayList<String>();
        for (int i = 0; i < cAmount; i++){
            System.out.print("Enter a name: ");
            Scanner person = new Scanner(System.in);
            var name = person.nextLine();
            if (name.matches(" ") || (name.length() == 0)){
                break;
            }
            people.add(name);
        }

        return people;
    }

    public void printWinner(){
        var people = getList();
        if (people.size() > 0){
            String prize;
            prize = chooseWinner(people);
            System.out.printf("The winner is... %s.%n", prize);
        }
    }

    public String chooseWinner(List<String> people){
        int ofList;
        ofList = random.nextInt(people.size());
        return people.get(ofList);
    }
}
