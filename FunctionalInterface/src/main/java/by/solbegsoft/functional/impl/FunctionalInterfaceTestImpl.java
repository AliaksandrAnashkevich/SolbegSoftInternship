package by.solbegsoft.functional.impl;

import by.solbegsoft.functional.FunctionalInterfaceTest;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfaceTestImpl implements FunctionalInterfaceTest {
    @Override
    public boolean stringSizeMore5(String str) {
        Predicate<String> isSizeMore5 = s -> s.length() > 5;
        return isSizeMore5.test(str);
    }

    @Override
    public boolean threeStringSizeMore5(String str1, String str2, String str3) {
        Predicate<List<String>> isSizeMore5 = strings -> strings
                .stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList())
                .equals(strings);
        return isSizeMore5.test(Arrays.asList(str1, str2, str3));
    }

    @Override
    public boolean notNullAndNotEmptyString(String str) {
        Predicate<String> isNotNull = s -> !s.isEmpty();
        Predicate<String> isNotEmpty = Objects::nonNull;
        return isNotEmpty.and(isNotNull).test(str);
    }

    @Override
    public void printString(String str) {
        Consumer<String> print = System.out::println;
        print.accept(str);
    }

    @Override
    public String congratulation(String name) {
        final String PART = "Happy new year - ";
        UnaryOperator<String> concatWrapper = PART::concat;
        return concatWrapper.apply(name);
    }

    @Override
    public int lengthWrapper(String str) {
        Function<String, Integer> wrapper = String::length;
        return wrapper.apply(str);
    }

    @Override
    public double randomNumber() {
        Supplier<Double> random = Math::random;
        return random.get();
    }
}
