/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class winnerTest {

    @Test
    void printWinner() {
        App app = new App();
        app.setOfList(2);
        assert app.getOfList() == 2;
    }
}