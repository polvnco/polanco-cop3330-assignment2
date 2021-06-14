/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramTest {

    @Test
    void is_Not_An_Anagram() {
        App app = new App();
        boolean result = app.isAnagram();
        System.out.println(result);
    }
}