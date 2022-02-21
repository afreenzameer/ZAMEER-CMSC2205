
package edu.ben.lab_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class CircleTest {

    @ParameterizedTest
    @MethodSource("provideArea")
    void testArea(double radius, double expected) {
        Circle r = new Circle(radius);
        Assertions.assertEquals(expected, r.area());
    }

    private static Stream<Arguments> provideArea() {
        return Stream.of(
                Arguments.of(1, Math.PI),
                Arguments.of(2, 4*Math.PI),
                Arguments.of(3, 9*Math.PI)


        );
    }

    @ParameterizedTest
    @MethodSource("providePerimeter")
    void testPerimeter(double radius, double expected) {
        Circle s = new Circle(radius);
        Assertions.assertEquals(expected, s.perimeter());
    }

    private static Stream<Arguments> providePerimeter() {
        return Stream.of(
                Arguments.of(1, 2 * Math.PI),
                Arguments.of(2, 4 * Math.PI),
                Arguments.of(3, 6 * Math.PI)


        );
    }
}
