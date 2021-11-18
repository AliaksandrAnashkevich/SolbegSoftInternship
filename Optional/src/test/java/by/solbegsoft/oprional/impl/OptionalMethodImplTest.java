package by.solbegsoft.oprional.impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.oprional.OptionalMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OptionalMethodImplTest {

    @Test
    void userExecutor() {
        OptionalMethod optionalMethod = new OptionalMethodImpl();
        String expected = "DEFAULT,12,reallycomplexmail222@hh.ru";
        String actual = optionalMethod.userExecutor(new User(null, 12, Arrays.asList("reallycomplexmail222@hh.ru")));
        Assertions.assertEquals(expected, actual);
    }
}