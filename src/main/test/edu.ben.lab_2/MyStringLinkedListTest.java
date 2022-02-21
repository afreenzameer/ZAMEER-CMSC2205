package edu.ben.lab_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class MyStringLinkedListTest {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testAdd(int size) {
        MyStringLinkedList s = new MyStringLinkedList();

        for (int i = 1; i <= size; i++) {
            s.add(String.valueOf(i));
        }
        Assertions.assertEquals(size, s.size());
    }

    @Test
    void testAddOnEmpty() {
        MyStringLinkedList s = new MyStringLinkedList();
        s.add("tree");
        Assertions.assertEquals(1,s.size());
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
        MyStringLinkedList s = new MyStringLinkedList();

        for (int i = 1; i <= size; i++) {
            s.add(String.valueOf(i));
        }
        String d = s.remove();
        Assertions.assertEquals(size - 1, s.size());
        Assertions.assertEquals(String.valueOf(size), d );
    }
    
    @Test
    void testRemoveOnEmpty() {
        MyStringLinkedList s = new MyStringLinkedList();
        Assertions.assertNull(s.remove());
        Assertions.assertEquals(0,s.size());
    }
    
    
    
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testSize(int size) {
        MyStringLinkedList s = new MyStringLinkedList();

        for  (int i = 0; i < size; i++){
            s.add(("tree"));
        }

        Assertions.assertEquals(size, s.size());


    }


}
