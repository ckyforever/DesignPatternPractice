package org.example;

import org.example.color.Blue;
import org.example.color.Red;
import org.example.shape.Circle;
import org.example.shape.Square;
import org.example.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        var blueCircle = new Circle().setColor(new Blue());
        var blueSquare = new Square().setColor(new Blue());
        var blueTriangle = new Triangle().setColor(new Blue());
        var redCircle = new Circle().setColor(new Red());
        var redSquare = new Square().setColor(new Red());
        var redTriangle = new Triangle().setColor(new Red());

        System.out.println(blueCircle.toString());
        System.out.println(blueSquare.toString());
        System.out.println(blueTriangle.toString());
        System.out.println(redCircle.toString());
        System.out.println(redSquare.toString());
        System.out.println(redTriangle.toString());
    }
}