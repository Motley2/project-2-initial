package com.csc205.project2;

/*
Generate a Cube class. include methods for surface area and volume. include a tostring method. include getters/setters as appropriate
 */

public class Cube extends Shape {

    private double width;

    public Cube() {
        this.width = 0.0;
    }

    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }

    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        return "Cube { width = " + width + ", surface area = " + surfaceArea() + ", volume = " + volume() + "}";
    }
}