package by.solbegsoft.processor.impl;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import by.solbegsoft.interfaces.LambdaInterface;
import by.solbegsoft.processor.PersonProcessor;

import java.util.List;

public class PersonProcessorImpl implements PersonProcessor {
    @Override
    public void getInformation(List<Person> peoples, Position positions, int ages) {
        LambdaInterface lambdaInterface;
        lambdaInterface = ((people, position, age) ->
                people.stream()
                        .filter(person -> (person.getPosition()
                                .equals(position))
                                && (person.getAge() >= age))
                        .forEach(System.out::println));
        lambdaInterface.checkPerson(peoples,positions,ages);
        System.out.println(positions.workHours());
    }
}
