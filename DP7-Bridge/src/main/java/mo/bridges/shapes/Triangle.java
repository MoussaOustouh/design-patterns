package mo.bridges.shapes;

import mo.bridges.colors.Color;

public class Triangle extends Shape {
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle color is ");
        color.applyColor();
    }
}
