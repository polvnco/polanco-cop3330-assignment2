/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex33;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {

    String list = "";

    public static void main(String[] args) {
        App magic = new App();
        magic.magic8Ball();
    }

    public String getList(){
        return this.list;
    }

    public void setList(){
    }

    public void magic8Ball(){
        String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};
        System.out.print("What's your question?\n> ");
        Scanner q = new Scanner(System.in);
        q.next();
        System.out.println();
        int list;
        list = ThreadLocalRandom.current().nextInt(0, answers.length);
        System.out.println(answers[list]);
    }
}
