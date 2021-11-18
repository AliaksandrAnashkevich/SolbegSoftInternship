package by.solbegsoft.oprional.impl;

import by.solbegsoft.entity.User;
import by.solbegsoft.oprional.OptionalMethod;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMethodImpl implements OptionalMethod {

    private static final String DEFAULT_NAME="DEFAULT";
    private static final String NOT_DATA="NOT DATA";

    @Override
    public void userExecutor(User user) {
        StringBuilder answer = new StringBuilder();
        Optional<User> optionalUser = Optional.ofNullable(user);

        if (!optionalUser.isPresent()) {
            throw new RuntimeException("nullable user");
        }
        answer.append(nameExecutor(optionalUser));
        answer.append(',');
        answer.append(ageExecutor(optionalUser));
        answer.append(',');
        answer.append(emailExecutor(optionalUser));

        System.out.println(answer);
    }

    private String nameExecutor(Optional<User> optionalUser){
        if (optionalUser
                .filter(u -> Objects.nonNull(u.getName()))
                .isPresent()){
            return optionalUser.get().getName();
        }  else {
            return DEFAULT_NAME;
        }
    }

    private String ageExecutor(Optional<User> optionalUser){
        if (optionalUser
                .filter(u -> Objects.nonNull(u.getAge()))
                .isPresent()){
            return optionalUser.get().getAge().toString();
        }  else {
            return NOT_DATA;
        }
    }

    private String emailExecutor(Optional<User> optionalUser){
        if (optionalUser
                .filter(u -> Objects.nonNull(u.getAge()))
                .isPresent()){
            return optionalUser.get().getEmails().stream().collect(Collectors.joining(","));
        }  else {
            return NOT_DATA;
        }
    }
}
