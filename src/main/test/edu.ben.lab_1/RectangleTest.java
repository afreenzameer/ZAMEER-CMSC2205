package edu.ben.lab_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RectangleTest {
    @ParameterizedTest
    @MethodSource("provideArea")
    void testArea(double length, double width, double expected) {
        Rectangle r = new Rectangle(length, width);
        Assertions.assertEquals(expected, r.area());
    }

    private static Stream<Arguments> provideArea() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, 2, 4),
                Arguments.of(3,3, 9)


                );
    }

    @ParameterizedTest
    @MethodSource("providePerimeter")
    void testPerimeter(double length, double width, double expected) {
        Rectangle s = new Rectangle(length, width);
        Assertions.assertEquals(expected, s.perimeter());
    }

    private static Stream<Arguments> providePerimeter() {
        return Stream.of(
                Arguments.of(1, 1, 4),
                Arguments.of(2, 4, 12),
                Arguments.of(3,3, 12)


        );
    }
}
