package by.solbegsoft.oprional.impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.oprional.OptionalMethod;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Optional.of;
import static java.util.Optional.ofNullable;

/**
 * @author Alexander Anashkevich
 * <p>
 * If User is null - throw a RuntimeException, else display information (name, age, emails)
 * If emails are not null - concat emails in one line(split with ',' )
 * If name is null - set 'DEFAULT' name and display information (name, age, emails)
 */
public class OptionalMethodImpl implements OptionalMethod {

    @Override
    public String userExecutor(User user) {

        User result  = ofNullable(user)
                        .orElseThrow(() -> new RuntimeException("nullable user"));
        return result.toString();
    }

    public String usernameExecutor(User user) {
        Optional<User> optionalUser = Optional.ofNullable(user);

        return optionalUser
                .filter(u -> Objects.nonNull(u.getName()))
                .map(User::getName)
                .orElse(DEFAULT_NAME);
    }

    @Override
    public String userEmailExecutor(User user) {
        List<String> optionalEmails = user.getEmails();

        if (Objects.nonNull(optionalEmails)) {
            String answer = optionalEmails.stream()
                    .filter(Objects::nonNull)
                    .collect(Collectors.joining(","));
            return answer.isEmpty() ? NOT_DATA : answer;
        }
        return NOT_DATA;
    }
}