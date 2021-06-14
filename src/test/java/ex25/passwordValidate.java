/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidate {

    @Test
    void test_If_Very_Strong_Password_Entered() {
        App veryStrongTest = new App();

        boolean vs = veryStrongTest.vsPassword("abcd1234$");


        assertTrue(vs);
    }
    @Test
    void test_If_Strong_Password_Entered() {
        App strongTest = new App();

        boolean s = strongTest.sPassword("abcd1234");


        assertTrue(s);
    }
    @Test
    void test_If_Weak_Password_Entered() {
        App weakTest = new App();

        boolean w = weakTest.wPassword("abcd");


        assertTrue(w);
    }
    @Test
    void test_If_Very_Weak_Password_Entered() {
        App veryWeakTest = new App();

        boolean vw = veryWeakTest.vwPassword("1234");


        assertTrue(vw);
    }
}