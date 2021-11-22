package by.solbegsoft.interfaces;

import by.solbegsoft.entity.Person;

@FunctionalInterface
public interface PrinterInterface {
    void print(Person person);
}
