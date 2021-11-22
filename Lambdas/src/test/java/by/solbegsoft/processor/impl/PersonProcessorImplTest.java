package by.solbegsoft.processor.impl;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import by.solbegsoft.processor.PersonProcessor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PersonProcessorImplTest {

    private final PersonProcessor processor = new PersonProcessorImpl();

    @Test
    void filterPerson() {
        processor.personProcessor(peopleBuilderCollection(),
                (person) -> person.getAge() > 20,
                System.out::println);
    }

    private static List<Person> peopleBuilderCollection() {
        return Arrays.asList(
                new Person("Petr", "petr@solbeg.com", Position.DEVELOPER, 24),
                new Person("Evgeniy", "evg@mail.com", Position.MANAGER, 18),
                new Person("Anna", "anna@google.com", Position.DEVELOPER, 21),
                new Person("Mark", "thanos@titanov.net", Position.HR, 33)
        );
    }

}