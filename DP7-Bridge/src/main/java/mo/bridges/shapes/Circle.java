package mo.bridges.shapes;

import mo.bridges.colors.Color;

public class Circle extends Shape {
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle color is ");
        color.applyColor();
    }
}
