package edu.ben.lab_1;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }


    public void setLength(double length) {
        if (length < 0) {
            System.out.println("length cannot be negative");
        } else {
            this.length = length;
        }
    }

    public double getLength(double length) {
        return this.length;
    }


    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("width cannot be negative");
        } else {
            this.width = width;
        }
    }

    public double getWidth(double width) {
        return this.width;
    }

    @Override
    public Double perimeter() {
        return 2 * width + 2 * length;
    }


    @Override
    public Double area() {
        return length * width;
    }
}
