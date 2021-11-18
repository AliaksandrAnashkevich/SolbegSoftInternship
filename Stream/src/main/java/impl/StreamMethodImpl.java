package impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.stream.StreamMethod;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alexander Anashkevich
 */
public class StreamMethodImpl implements StreamMethod {

    /**
     * 1. Print name of each user
     * @param userList
     */
    @Override
    public void printAllNames(List<User> userList) {
        userList.stream()
                .map(User::getName)
                .forEach(System.out::println);
    }

    /**
     * 2. Print name only if user age >= 18
     * @param userList
     */
    @Override
    public void printMajorUserNames(List<User> userList) {
        userList.stream()
                .filter(user -> user.getAge() < 18)
                .map(User::getName)
                .forEach(System.out::println);
    }

    /**
     * 3. Print unique names
     * @param userList
     */
    @Override
    public void printUniqueNames(List<User> userList) {
        userList.stream()
                .map(User::getName)
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * 4. Print unique emails of users
     * @param userList
     */
    @Override
    public void printUniqueUserEmails(List<User> userList) {
        userList.stream().flatMap(user -> user.getEmails()
                                                .stream()
                                                .distinct())
                .forEach(System.out::println);
    }

    /**
     * 5. Print total age (sum) of all users
     * @param userList
     * @return
     */
    @Override
    public int printCountAllAge(List<User> userList) {
        return userList.stream()
                .mapToInt(User::getAge)
                .sum();
    }

    /**
     * 6. Print all unique usernames in one line (should be one String)
     * @param userList
     * @return
     */
    @Override
    public String uniqueUsername(List<User> userList) {
        return userList.stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
    }
}




