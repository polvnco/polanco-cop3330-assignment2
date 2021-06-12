package ex33;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        App magic = new App();
        magic.magic8Ball();
    }

    public void magic8Ball(){
        String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};
        System.out.print("What's your question?\n> ");
        Scanner q = new Scanner(System.in);
        q.next();
        System.out.println();
        var list = ThreadLocalRandom.current().nextInt(0, answers.length);
        System.out.println(answers[list]);
    }
}
