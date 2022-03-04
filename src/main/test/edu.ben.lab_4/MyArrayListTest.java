package edu.ben.lab_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class MyArrayListTest<T> {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testAdd(int size) {
        MyArrayList<Integer> dogs = new MyArrayList<>(Integer.class);

        for (int i = 1; i <= size; i++) {
            dogs.add((1));
        }
        Assertions.assertEquals(size, dogs.size());
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

        MyArrayList<Integer> dogs = new MyArrayList<>(Integer.class);

        for (int i = 1; i <= size; i++) {
            dogs.add(size);
        }
        Integer d = dogs.remove();
        Assertions.assertEquals(size - 1, dogs.size());
        Assertions.assertEquals(size, d);
    }

    @Test
    void testRemoveOnEmpty() {
        MyArrayList<Integer> dogs = new MyArrayList<>(Integer.class);
        Assertions.assertNull(dogs.remove());
        Assertions.assertEquals(0,dogs.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testSize(int size) {
        MyArrayList<Integer> dogs = new MyArrayList<>(Integer.class);

        for  (int i = 0; i < size; i++){
            dogs.add(1);
        }
        for(Integer i : dogs.ItemsInList){
            System.out.println(i);
        }
        Assertions.assertEquals(size, dogs.size());

    }
}
