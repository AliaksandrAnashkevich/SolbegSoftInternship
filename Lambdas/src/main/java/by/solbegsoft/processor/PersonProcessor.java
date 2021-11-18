package by.solbegsoft.processor;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;

import java.util.List;

public interface PersonProcessor {

    void getInformation(List<Person> people, Position position, int age);
}
