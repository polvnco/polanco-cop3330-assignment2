/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addTest {

    @Test
    void addingNumbers() {
        App app = new App();
        app.setTotal(1);
        assert app.getTotal() == 1;
    }
}