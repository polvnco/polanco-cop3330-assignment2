/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex29;

import org.junit.jupiter.api.Test;

class badInputTest {

    @Test
    void handlingBadInput() {
        App app = new App();
        app.setRate(40);
        assert app.getRate() == 40;
    }
}