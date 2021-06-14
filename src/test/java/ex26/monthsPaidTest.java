/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex26;

import org.junit.jupiter.api.Test;

class monthsPaidTest {

    @Test
    void callBalance() {
        App app = new App();
        app.setBalance(1000);
        assert app.getBalance() == 1000;
    }
    @Test
    void callInterestRate() {
        App app = new App();
        app.setInterestRate(12);
        assert app.getInterestRate() == 12;
    }

    @Test
    void callPayment() {
        App app = new App();
        app.setPayment(100);
        assert app.getPayment() == 100;
    }
}