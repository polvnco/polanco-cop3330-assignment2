/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ballTest {

    @Test
    void magic8Ball() {
        App ball_of_8 = new App();

        ball_of_8.setList();
        assertFalse(Boolean.parseBoolean(ball_of_8.getList()));
    }
}