/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tableSizeTest {

    @Test
    void multiplicationTable_should_not_print() {
        App app = new App();
        app.setTableSize(0);
        assert app.getTableSize() == 0;
    }
}