package edu.ben.lab_1;


// This is a shape
public interface Shape {
    Double area();
    Double perimeter();

    default Double volume(){

        System.out.println("volume not implemented");

        return null;
    }

}
