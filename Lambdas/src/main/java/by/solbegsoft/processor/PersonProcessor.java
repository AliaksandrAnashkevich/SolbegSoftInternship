package by.solbegsoft.processor;

import by.solbegsoft.entity.Person;
import by.solbegsoft.entity.Position;
import by.solbegsoft.interfaces.FilterInterface;
import by.solbegsoft.interfaces.PrinterInterface;

import java.util.List;

public interface PersonProcessor {

    void personProcessor(List<Person> people, FilterInterface filter, PrinterInterface print);
}
