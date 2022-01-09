package mo;

import mo.bridges.colors.BlueColor;
import mo.bridges.colors.GreenColor;
import mo.bridges.colors.RedColor;
import mo.bridges.shapes.Circle;
import mo.bridges.shapes.Shape;
import mo.bridges.shapes.Square;
import mo.bridges.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        circle.applyColor();

        Shape square = new Square(new GreenColor());
        square.applyColor();

        Shape triangle = new Triangle(new BlueColor());
        triangle.applyColor();
    }
}
