package edu.ben.lab_1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("radius cannot be negative");
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public Double perimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}
