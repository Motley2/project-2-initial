package com.csc205.project2;

/*
Generate a Cylinder class. include methods for surface area and volume. include a tostring method. include getters/setters as appropriate
 */

public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder() {
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder { height = " + height + ", radius = " + radius + ", surface area = " + surfaceArea() + ", volume = " + volume() + "}";
    }
}