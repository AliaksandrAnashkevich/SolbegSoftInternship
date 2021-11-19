package by.solbegsoft.main;

import by.solbegsoft.entity.User;
import by.solbegsoft.oprional.OptionalMethod;
import by.solbegsoft.oprional.impl.OptionalMethodImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        OptionalMethod optionalMethod = new OptionalMethodImpl();

        System.out.println(optionalMethod.userEmailExecutor(new User(null, 12, null)));
    }
}
