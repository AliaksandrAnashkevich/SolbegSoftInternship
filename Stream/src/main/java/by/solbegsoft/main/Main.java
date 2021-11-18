package by.solbegsoft.main;

import by.solbegsoft.entity.User;
import by.solbegsoft.stream.StreamMethod;
import by.solbegsoft.stream.impl.StreamMethodImpl;

public class Main {

    public static void main(String[] args) {
        StreamMethod streamMethod = new StreamMethodImpl();
        streamMethod.printCountAllAge(User.buildUsersCollection());
    }
}
