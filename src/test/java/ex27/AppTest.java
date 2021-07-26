package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void test_If_Is_Not_Digit() {
        String test = "x";
        String test2 = "123";
        assertFalse(App.isDigit(test));
        assertTrue(App.isDigit(test2));
    }

    @Test
    void testID_Format() {
        String test = "A1-1234";
        String test2 = "AA-1234";
        assertFalse(App.validateID(test));
        assertTrue(App.validateID(test2));
    }
}