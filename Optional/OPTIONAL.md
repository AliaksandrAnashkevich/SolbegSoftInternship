#Optional
You have a User class
```java
//constructor and getters
public class User {
    private String name;
    private Integer age;
    private List<String> emails;
```

Implement methods which get a user object and:
```java
    // Call this appropriate to particular requirement
    public static void userExecutor(User user){
        /**
         * Your implementation
         */
    }
```

1. If User is null - throw a RuntimeException, else display information (name, age, emails)
2. If emails are not null - concat emails in one line(split with ',' )
3. If name is null - set 'DEFAULT' name and display information (name, age, emails)

##Requirements
* Use Optional class in each implementation
* Each point should be in each method
* (OPTIONAL) Write unit tests
