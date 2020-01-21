/*
1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
In case the radius parameter is less than 0 it needs to set the radius field value to 0.

Write the following methods (instance methods):
* Method named getRadius without any parameters, it needs to return the value of radius field.
* Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.

2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
 */

package com.bartoszdopke;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        double area = radius*radius*Math.PI;
        return area;
    }

}