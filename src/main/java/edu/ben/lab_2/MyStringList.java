package edu.ben.lab_2;

public interface MyStringList {


    default void add(String value) {

        System.err.println("This method has not yet been implemented.");
    }

    default void clear() {

        System.err.println("This method has not yet been implemented.");

    }

    default String remove() {

        System.err.println("This method has not yet been implemented.");

        return null;
    }
    default int size(){

        System.err.println("This method has not yet been implemented.");

        return 0;
    }

}
