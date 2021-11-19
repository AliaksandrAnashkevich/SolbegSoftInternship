package by.solbegsoft.interfaces;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;

import java.util.List;

@FunctionalInterface
public interface FilterInterface {
    boolean filter(Person person);
}
