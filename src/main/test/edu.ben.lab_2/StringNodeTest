package edu.ben.lab_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringNodeTest {

    @ParameterizedTest
    @MethodSource("provideSetValue")
    void testSetValue(String value) {
        StringNode s = new StringNode(value);
        Assertions.assertEquals(value, s.getValue());
    }

    private static Stream<Arguments> provideSetValue() {
        return Stream.of(
                Arguments.of("Takis"),
                Arguments.of("Haribos"),
                Arguments.of("Red Bull")


        );
    }

    @ParameterizedTest
    @MethodSource("provideGetValue")
    void testGetValue(String value) {
        StringNode s = new StringNode(value);
        Assertions.assertEquals(value, s.getValue());
    }

    private static Stream<Arguments> provideGetValue() {
        return Stream.of(
                Arguments.of("hearts"),
                Arguments.of("stars"),
                Arguments.of("circles")


        );
    }

    @ParameterizedTest
    @MethodSource("provideSetNext")
    void testSetNext(String next) {
        StringNode s = new StringNode(next);
        Assertions.assertEquals(next, s.getValue());
    }

    private static Stream<Arguments> provideSetNext() {
        return Stream.of(
                Arguments.of("car"),
                Arguments.of("table"),
                Arguments.of("book")


        );
    }

    @ParameterizedTest
    @MethodSource("provideGetNext")
    void testGetNext(String next) {
        StringNode s = new StringNode(next);
        Assertions.assertEquals(next, s.getValue());
    }

    private static Stream<Arguments> provideGetNext() {
        return Stream.of(
                Arguments.of("chicken"),
                Arguments.of("nugget"),
                Arguments.of("necklace")


        );
    }

    @ParameterizedTest
    @MethodSource("provideHasNext")
    void testHasNext(String next) {
        StringNode s = new StringNode(next);
        Assertions.assertEquals(next, s.getValue());
    }

    private static Stream<Arguments> provideHasNext() {
        return Stream.of(
                Arguments.of("group"),
                Arguments.of("liquid"),
                Arguments.of("change")


        );
    }

}
