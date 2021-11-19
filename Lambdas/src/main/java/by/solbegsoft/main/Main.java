package by.solbegsoft.main;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import by.solbegsoft.processor.PersonProcessor;
import by.solbegsoft.processor.impl.PersonProcessorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Find persons who have a particular position and restrict persons by age
     * Display found people to console with personal information (name , age)
     * Display working hours (this logic applies to Position enum)
     */
    public static void main(String[] args) {
        List<Person> personList = peopleBuilderCollection();
        PersonProcessor processor = new PersonProcessorImpl();
        processor.personProcessor(personList,
                (x) -> x.getPosition().equals(Position.DEVELOPER) && x.getAge() >= 20,
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
