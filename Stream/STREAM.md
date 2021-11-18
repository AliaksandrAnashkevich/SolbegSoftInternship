#Stream
You have a list of users
```java
//constructor and getters
public class User {
    private String name;
    private Integer age;
    private List<String> emails;
```
```java
    private static List<User> buildUsersCollection() {
        return Arrays.asList(
                new User("Ivan", 14, Arrays.asList("idontliketorepeattwice@mail.ru", "idontliketorepeattwice@mail.ru", "msin@fds.com")),
                new User("John", 18, Arrays.asList("lemon@john.com", "j@weak.io", "j@weak.io", "j@weak.io")),
                new User("Maria", 23, Arrays.asList("db@maria.ru", "xray@gmail.com", "xray@gmail.com", "xray@gmail.com")),
                new User("Kate", 32, Arrays.asList("hh@tut.ru", "passwordisthesameaslogin@gmail.com")),
                new User("Phil", 12, Arrays.asList("reallycomplexmail222@hh.ru")),
                new User("Kate", 19, Arrays.asList("reallycomplexmail333@hh.ru")),
                new User("John", 22, Arrays.asList("reallycomplexmail444@hh.ru", "idontliketorepeattwice@mail.ru"))
        );
    }
```

Implement:
1. Print name of each user
2. Print name only if user age >= 18
3. Print unique names
4. Print unique emails of users
5. Print total age (sum) of all users
6. Print all unique usernames in one line (should be one String)

##Requirements
* Each implementation should be in personal method (can be in one class)
* Use stream abilities
* (OPTIONAL) Write unit tests
