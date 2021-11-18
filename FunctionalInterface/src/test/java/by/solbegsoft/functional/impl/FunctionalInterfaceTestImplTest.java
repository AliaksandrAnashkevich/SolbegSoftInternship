package by.solbegsoft.functional.impl;

import by.solbegsoft.functional.FunctionalInterfaceTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalInterfaceTestImplTest {

    private static final FunctionalInterfaceTest functionalInterface = new FunctionalInterfaceTestImpl();

    @Test
    void stringSizeMore5() {
        String includeData = "123456";
        boolean actual = functionalInterface.stringSizeMore5(includeData);
        assertTrue(actual);
    }

    @Test
    void threeStringSizeMore5() {
        String includeData1 = "123456";
        String includeData2 = "1234567890";
        String includeData3 = "asdfghjkl";
        boolean actual = functionalInterface.threeStringSizeMore5(includeData1, includeData2, includeData3);
        assertTrue(actual);
    }

    @Test
    void notNullAndNotEmptyString() {
        String includeData = "123456";
        boolean actual = functionalInterface.notNullAndNotEmptyString(includeData);
        assertTrue(actual);
    }

    @Test
    void printString() {
        assertTrue(true);
    }

    @Test
    void congratulation() {
        String expected = "Happy new year - name";
        String actual = functionalInterface.congratulation("name");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lengthWrapper() {
        String includeData = "123456";
        int expected = 6;
        int actual = functionalInterface.lengthWrapper(includeData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void randomNumber() {
        assertTrue(true);
    }
}