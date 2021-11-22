package by.solbegsoft.oprional.impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.oprional.OptionalMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

class OptionalMethodImplTest {

    private final OptionalMethod optionalMethod = new OptionalMethodImpl();

    @Test
    void userExecutor() {

        User user = new User(null, 12, Arrays.asList("reallycomplexmail222@hh.ru"));
        String expected = user.toString();
        String actual = optionalMethod.userExecutor(user);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void userExecutorNull() {
        User user = null;
        String expected = new RuntimeException("nullable user").getMessage();
        RuntimeException actual = assertThrows(
                RuntimeException.class,
                () -> optionalMethod.userExecutor(user));
        Assertions.assertEquals(expected, actual.getMessage());
    }

    @Test
    void usernameExecutor() {
        User user = new User("Kate", 12, Arrays.asList("reallycomplexmail222@hh.ru"));
        String expected = user.getName();
        String actual = optionalMethod.usernameExecutor(user);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void usernameExecutorWithNullField() {
        User user = new User(null, 12, Arrays.asList("reallycomplexmail222@hh.ru"));
        String expected = "DEFAULT";
        String actual = optionalMethod.usernameExecutor(user);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void userEmailExecutor() {
        User user = new User("Ivan", 14, Arrays.asList("idontliketorepeattwice@mail.ru", "idontliketorepeattwice@mail.ru", "msin@fds.com"));
        String expected = String.join(",", user.getEmails());
        String actual = optionalMethod.userEmailExecutor(user);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void userEmailExecutorWithNullField() {
        User user = new User("Ivan", 14, null);
        String expected = "NOT DATA";
        String actual = optionalMethod.userEmailExecutor(user);
        Assertions.assertEquals(expected, actual);
    }
}