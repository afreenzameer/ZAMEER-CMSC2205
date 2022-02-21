package edu.ben.lab_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class NodeTest {

    @ParameterizedTest
    @MethodSource("provideSetValue")
    <T> void testSetValue(T value) {
        Node<T> s = new Node<>(value);
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
    <T> void testGetValue(T value) {
        Node<T> s = new Node<>(value);
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
    <T>void testSetNext(T next) {
        Node<T> s = new Node<>(next);
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
    <T>void testGetNext(T next) {
        Node<T> s = new Node<>(next);
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
    <T>void testHasNext(T next) {
        Node<T> s = new Node<>(next);
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

