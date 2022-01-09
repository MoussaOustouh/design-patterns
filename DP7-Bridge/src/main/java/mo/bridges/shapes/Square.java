package mo.bridges.shapes;

import mo.bridges.colors.Color;

public class Square extends Shape {
    public Square(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Square color is ");
        color.applyColor();
    }
}
