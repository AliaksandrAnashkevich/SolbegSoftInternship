package by.solbegsoft.stream.impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.stream.StreamMethod;

import java.util.List;

public class StreamMethodImpl implements StreamMethod {


    @Override
    public void printAllNames(List<User> userList) {
        userList.stream()
                .map(User::getName)
                .forEach(System.out::println);
    }

    @Override
    public void printMajorUserNames(List<User> userList) {
        userList.stream()
                .filter(user -> user.getAge() < 18)
                .map(User::getName)
                .forEach(System.out::println);
    }

    @Override
    public void printUniqueNames(List<User> userList) {
        userList.stream()
                .map(User::getName)
                .distinct()
                .forEach(System.out::println);
    }

    @Override
    public void printUniqueUserEmails(List<User> userList) {
        userList.stream().flatMap(user -> user.getEmails()
                                                .stream()
                                                .distinct())
                .forEach(System.out::println);
    }

    @Override
    public int printCountAllAge(List<User> userList) {
        return userList.stream()
                .mapToInt(User::getAge)
                .sum();
    }
}
