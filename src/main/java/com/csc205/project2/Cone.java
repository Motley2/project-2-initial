package com.csc205.project2;

/*
Generate a Cone class. include methods for surface area and volume. include a tostring method. include getters/setters as appropriate
 */
public class Cone extends Shape {

    private double height;
    private double radius;

    public Cone() {
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double height, double radius) {
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
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cone { height = " + height + ", radius = " + radius + ", surface area = " + surfaceArea() + ", volume = " + volume() + "}";
    }
}