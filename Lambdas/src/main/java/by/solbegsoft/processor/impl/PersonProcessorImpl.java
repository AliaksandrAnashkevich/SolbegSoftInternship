package by.solbegsoft.processor.impl;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import by.solbegsoft.interfaces.FilterInterface;
import by.solbegsoft.interfaces.PrinterInterface;
import by.solbegsoft.processor.PersonProcessor;

import java.util.List;
import java.util.stream.Collectors;

public class PersonProcessorImpl implements PersonProcessor {
    @Override
    public void getInformation(List<Person> people, Position position, int age) {

        printPerson(filterPerson(people, position, age));
    }

    public List<Person> filterPerson(List<Person> peoples, Position positions, int ages) {
        FilterInterface filterInterface;
        filterInterface = ((people, position, age) ->
                people.stream()
                        .filter(person ->
                                (person.getPosition().equals(position))
                                        && (person.getAge() >= age))
                        .collect(Collectors.toList()));
        return filterInterface.checkPerson(peoples, positions, ages);
    }

    private void printPerson(List<Person> peoples) {
        if (!peoples.isEmpty()) {
            PrinterInterface printerInterface;
            printerInterface = people -> people
                    .forEach(System.out::println);
            printerInterface.print(peoples);
            System.out.println(peoples.get(0).getPosition().workHours());
        }
    }
}
