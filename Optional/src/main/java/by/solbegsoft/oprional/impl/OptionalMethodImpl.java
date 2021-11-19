package by.solbegsoft.oprional.impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.oprional.OptionalMethod;

import java.util.Objects;
import java.util.Optional;

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
        Optional<User> optionalUser = Optional.ofNullable(user);

        if (!optionalUser.isPresent()) {
            throw new RuntimeException("nullable user");
        }

        return optionalUser
                .get()
                .toString();
    }

    public String usernameExecutor(User user) {
        Optional<User> optionalUser = Optional.ofNullable(user);
        if (optionalUser
                .filter(u -> Objects.nonNull(u.getName()))
                .isPresent()) {
            return optionalUser
                    .get()
                    .getName();
        } else {
            return DEFAULT_NAME;
        }
    }

    @Override
    public String userEmailExecutor(User user) {
        Optional<User> optionalUser = Optional.ofNullable(user);
        if (optionalUser
                .filter(u -> Objects.nonNull(u.getEmails()))
                .isPresent()) {
            return String.join(",", optionalUser
                                            .get()
                                            .getEmails());
        } else {
            return NOT_DATA;
        }
    }

}
