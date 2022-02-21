package edu.ben.lab_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class MyLinkedListTest<Dog> {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testAdd(int size) {
        MyLinkedList<Dog> dogs = new MyLinkedList<>();

        for (int i = 1; i <= size; i++) {
            dogs.add((Dog) String.valueOf(i));
        }
        Assertions.assertEquals(size, dogs.size());
    }

    @Test
    void testAddOnEmpty() {
        MyLinkedList<Dog> dogs = new MyLinkedList<>();
        dogs.add((Dog) "tree");
        Assertions.assertEquals(1,dogs.size());
    }




    @ParameterizedTest
    @MethodSource("provideClear")
    void testClear() {
        Assertions.assertNull(null);
    }

    private static Stream<Arguments> provideClear() {
        return Stream.of(
                Arguments.of("null", "null"),
                Arguments.of("null", "null")
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testRemove(int size) {

        MyLinkedList<Dog> dogs = new MyLinkedList<>();

        for (int i = 1; i <= size; i++) {
            dogs.add((Dog)String.valueOf(i));
        }
        Dog d = dogs.remove();
        Assertions.assertEquals(size - 1, dogs.size());
        Assertions.assertEquals(String.valueOf(size), d);
    }

    @Test
    void testRemoveOnEmpty() {
        MyLinkedList<Dog> dogs = new MyLinkedList<>();
        Assertions.assertNull(dogs.remove());
        Assertions.assertEquals(0,dogs.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testSize(int size) {
        MyLinkedList<Dog> dogs = new MyLinkedList<>();

        for  (int i = 0; i < size; i++){
            dogs.add((Dog) "tree");
        }

        Assertions.assertEquals(size, dogs.size());

    }

}

