package by.solbegsoft.interfaces;

import by.solbegsoft.entity.Person;

@FunctionalInterface
public interface FilterInterface {
    boolean filter(Person person);
}
