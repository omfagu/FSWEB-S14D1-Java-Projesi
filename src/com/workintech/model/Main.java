package com.workintech.model;

import com.workintech.Circle.Circle;
import com.workintech.Circle.Cylinder;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        Cylinder cylinder= new Cylinder(5.55, 7.25);
        Rectangle rectangle = new Rectangle(5,10);
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("*******************************************");
        System.out.println("circle radius = " + circle.getRadius());
        System.out.println("circle area= "+ circle.getArea());
        System.out.println("cylinder radius ="+ cylinder.getRadius());
        System.out.println("cylinder heigt= "+ cylinder.getHeight());
        System.out.println("cylinder area = "+ cylinder.getArea());
        System.out.println("cylinder volume = "+ cylinder.getVolume());
        System.out.println("*******************************************");
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("*******************************************");
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("*******************************************");
    }
}