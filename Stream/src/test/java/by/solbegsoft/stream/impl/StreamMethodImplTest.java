package by.solbegsoft.stream.impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.stream.StreamMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StreamMethodImplTest {

    @Test
    public void printCountAllAge() {
        StreamMethod streamMethod = new StreamMethodImpl();
        List<User> users = Arrays.asList(
                new User("Ivan", 14, Arrays.asList("idontliketorepeattwice@mail.ru", "idontliketorepeattwice@mail.ru", "msin@fds.com")),
                new User("John", 18, Arrays.asList("lemon@john.com", "j@weak.io", "j@weak.io", "j@weak.io")),
                new User("Maria", 23, Arrays.asList("db@maria.ru", "xray@gmail.com", "xray@gmail.com", "xray@gmail.com")),
                new User("Kate", 32, Arrays.asList("hh@tut.ru", "passwordisthesameaslogin@gmail.com")),
                new User("Phil", 12, Arrays.asList("reallycomplexmail222@hh.ru")),
                new User("Kate", 19, Arrays.asList("reallycomplexmail333@hh.ru")),
                new User("John", 22, Arrays.asList("reallycomplexmail444@hh.ru", "idontliketorepeattwice@mail.ru")));
        int expected = 140;
        int actual = streamMethod.printCountAllAge(users);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void uniqueUsername() {
        StreamMethod streamMethod = new StreamMethodImpl();
        List<User> users = Arrays.asList(
                new User("Ivan", 14, Arrays.asList("idontliketorepeattwice@mail.ru", "idontliketorepeattwice@mail.ru", "msin@fds.com")),
                new User("John", 18, Arrays.asList("lemon@john.com", "j@weak.io", "j@weak.io", "j@weak.io")),
                new User("Maria", 23, Arrays.asList("db@maria.ru", "xray@gmail.com", "xray@gmail.com", "xray@gmail.com")),
                new User("Kate", 32, Arrays.asList("hh@tut.ru", "passwordisthesameaslogin@gmail.com")),
                new User("Phil", 12, Arrays.asList("reallycomplexmail222@hh.ru")),
                new User("Kate", 19, Arrays.asList("reallycomplexmail333@hh.ru")),
                new User("John", 22, Arrays.asList("reallycomplexmail444@hh.ru", "idontliketorepeattwice@mail.ru")));
        String expected = "Ivan, John, Maria, Kate, Phil, Kate, John";
        String actual = streamMethod.uniqueUsername(users);
        Assertions.assertEquals(expected, actual);
    }
}