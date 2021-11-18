package by.solbegsoft.interfaces;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface FilterInterface {
    List<Person> checkPerson(List<Person> people, Position position, int age);
    List<Person> personList = Arrays.asList(
            new Person("Petr", "petr@solbeg.com", Position.DEVELOPER, 24),
            new Person("Evgeniy", "evg@mail.com", Position.MANAGER, 18),
            new Person("Anna", "anna@google.com", Position.DEVELOPER, 21),
            new Person("Mark", "thanos@titanov.net", Position.HR, 33)
    );

}
