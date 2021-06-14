/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex31;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void karvonenHeartRate_should_be_an_int() {
        App app = new App();
        app.setTotal(1000);
        assert app.getTotal() == 1000;
    }
}