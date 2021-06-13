package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidate {

    @Test
    void passwordValidator() {
        App veryStrongTest = new App();
        App strongTest = new App();
        App weakTest = new App();
        App veryWeakTest = new App();

        boolean vs = veryStrongTest.vsPassword("abcd1234$");
        boolean s = strongTest.sPassword("abcd1234");
        boolean w = weakTest.wPassword("abcd");
        boolean vw = veryWeakTest.vwPassword("1234");


        assertTrue(vs);
        assertTrue(s);
        assertTrue(w);
        assertTrue(vw);
    }
}