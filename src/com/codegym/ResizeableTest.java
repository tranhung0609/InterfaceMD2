package com.codegym;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(30, 40);

        System.out.println("Pre-Resizeable");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("-------");
        System.out.println("After-sorted: ");
        for (Shape shape : shapes) {
           if (shape instanceof Circle){
               ((Circle)shape).resize(Math.floor(Math.random()*100+1));
           } else if (shape instanceof Rectangle){
               ((Rectangle)shape).resize(Math.floor(Math.random()*100+1));
           }
            System.out.println(shape);
        }
    }
}
