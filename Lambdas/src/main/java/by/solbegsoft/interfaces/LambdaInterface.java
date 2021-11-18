package by.solbegsoft.interfaces;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;

import java.util.List;

@FunctionalInterface
public interface LambdaInterface {
    void checkPerson(List<Person> people, Position position, int age);
}
