package by.solbegsoft.processor.impl;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import by.solbegsoft.interfaces.FilterInterface;
import by.solbegsoft.interfaces.PrinterInterface;
import by.solbegsoft.processor.PersonProcessor;
import lombok.var;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Alexander Anashkevich
 *  Find persons with DEVELOPMENT position and older than 20 y.o.
 */
public class PersonProcessorImpl implements PersonProcessor {
    @Override
    public void personProcessor(List<Person> people, FilterInterface filter, PrinterInterface print) {
        List<Person> persons = people.stream()
                .filter(filter::filter)
                .collect(Collectors.toList());

        Position workingHours = persons
                .stream()
                .findAny()
                .map(Person::getPosition)
                .orElseThrow(() -> new RuntimeException("Person doesn't exist"));

        persons.forEach(print::print);
        System.out.println(workingHours);
    }
}
