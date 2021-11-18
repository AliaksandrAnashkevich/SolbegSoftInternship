package by.solbegsoft.functional.impl;

import by.solbegsoft.functional.FunctionalInterfaceTest;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * @author Alexander Anashkevich
 */
public class FunctionalInterfaceTestImpl implements FunctionalInterfaceTest {
    /**
     * Method takes a string and return true if length() > 5 (use Predicate)
     * @param str
     * @return
     */
    @Override
    public boolean stringSizeMore5(String str) {
        Predicate<String> isSizeMore5 = s -> s.length() > 5;
        return isSizeMore5.test(str);
    }

    /**
     * Method takes 3 strings and return true if length() > 5 in each string (use Predicate)
     * @param str1
     * @param str2
     * @param str3
     * @return
     */
    @Override
    public boolean threeStringSizeMore5(String str1, String str2, String str3) {
        Predicate<List<String>> isSizeMore5 = strings -> strings
                .stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList())
                .equals(strings);
        return isSizeMore5.test(Arrays.asList(str1, str2, str3));
    }

    /**
     * Method takes string and return true if string not null and not empty(use Predicate with and())
     * @param str
     * @return
     */
    @Override
    public boolean notNullAndNotEmptyString(String str) {
        Predicate<String> isNotNull = s -> !s.isEmpty();
        Predicate<String> isNotEmpty = Objects::nonNull;
        return isNotEmpty.and(isNotNull).test(str);
    }

    /**
     *
     * Method takes a string and print this (use Consumer)
     * @param str
     */
    @Override
    public void printString(String str) {
        Consumer<String> print = System.out::println;
        print.accept(str);
    }

    /**
     * Method takes a string with name and return 'Happy new year - {name}'(use Function or UnaryOperator)
     * @param name
     * @return
     */
    @Override
    public String congratulation(String name) {
        final String PART = "Happy new year - ";
        UnaryOperator<String> concatWrapper = PART::concat;
        return concatWrapper.apply(name);
    }

    /**
     * Method takes a string and return length() of this string(use Function)
     * @param str
     * @return
     */
    @Override
    public int lengthWrapper(String str) {
        Function<String, Integer> wrapper = String::length;
        return wrapper.apply(str);
    }

    /**)
     * Method takes nothing and return random number(use Supplier)
     * @return
     */
    @Override
    public double randomNumber() {
        Supplier<Double> random = Math::random;
        return random.get();
    }
}
