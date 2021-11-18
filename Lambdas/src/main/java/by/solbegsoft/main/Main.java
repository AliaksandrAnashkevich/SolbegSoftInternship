package by.solbegsoft.main;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import by.solbegsoft.processor.PersonProcessor;
import by.solbegsoft.processor.impl.PersonProcessorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     *  Find persons with DEVELOPMENT position and older than 20 y.o.
     */
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Petr", "petr@solbeg.com", Position.DEVELOPER, 24),
                new Person("Evgeniy", "evg@mail.com", Position.MANAGER, 18),
                new Person("Anna", "anna@google.com", Position.DEVELOPER, 21),
                new Person("Mark", "thanos@titanov.net", Position.HR, 33)
        );
        PersonProcessor processor = new PersonProcessorImpl();
        processor.getInformation(personList, Position.DEVELOPER, 20);
    }
}
