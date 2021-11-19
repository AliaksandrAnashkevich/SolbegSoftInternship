package by.solbegsoft.processor.impl;

import by.solbegsoft.entity.Person;
import by.solbegsoft.interfaces.FilterInterface;
import by.solbegsoft.interfaces.PrinterInterface;
import by.solbegsoft.processor.PersonProcessor;

import java.util.List;
import java.util.Optional;

/**
 * @author Alexander Anashkevich
 *  Find persons with DEVELOPMENT position and older than 20 y.o.
 */
public class PersonProcessorImpl implements PersonProcessor {
    @Override
    public void personProcessor(List<Person> people, FilterInterface filter, PrinterInterface print) {
        people.stream()
                .filter(filter::filter)
                .forEach(print::print);
        Optional<Person> optionalPerson = people.stream().filter(filter::filter).findAny();
        optionalPerson.ifPresent(person -> System.out.println(person.getPosition().workHours()));
    }
}
