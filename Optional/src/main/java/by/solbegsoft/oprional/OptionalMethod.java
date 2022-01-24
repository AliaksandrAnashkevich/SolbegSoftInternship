package by.solbegsoft.oprional;

import by.solbegsoft.entity.User;

public interface OptionalMethod {

    String DEFAULT_NAME = "DEFAULT";

    String NOT_DATA = "NOT DATA";

    String userExecutor(User user);

    String usernameExecutor(User user);

    String userEmailExecutor(User user);
}
