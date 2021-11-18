package by.solbegsoft.processor.impl;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PersonProcessorImplTest {

    @Test
    void filterPerson() {
        PersonProcessorImpl personProcessor = new PersonProcessorImpl();
        List<Person> personList = Arrays.asList(
                new Person("Petr", "petr@solbeg.com", Position.DEVELOPER, 24),
                new Person("Evgeniy", "evg@mail.com", Position.MANAGER, 18),
                new Person("Anna", "anna@google.com", Position.DEVELOPER, 21),
                new Person("Mark", "thanos@titanov.net", Position.HR, 33)
        );
        List<Person> expected = Arrays.asList(
                new Person("Petr", "petr@solbeg.com", Position.DEVELOPER, 24),
                new Person("Anna", "anna@google.com", Position.DEVELOPER, 21)
                );
        List<Person> actual = personProcessor.filterPerson(personList, Position.DEVELOPER, 20);
        Assertions.assertEquals(expected, actual);
    }
}