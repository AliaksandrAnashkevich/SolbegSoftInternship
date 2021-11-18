package by.solbegsoft.stream;

import by.solbegsoft.entity.User;

import java.util.List;

public interface StreamMethod {

    void printAllNames(List<User> userList);

    void printMajorUserNames(List<User> userList);

    void printUniqueNames(List<User> userList);

    void printUniqueUserEmails(List<User> userList);

    int printCountAllAge(List<User> userList);

    String uniqueUsername(List<User> userList);
}
