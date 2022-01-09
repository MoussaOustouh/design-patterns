package mo.bridges.shapes;

import mo.bridges.colors.Color;

/**
 * @author Moussa OUSTOUH
 * */
public abstract class Shape {
    // Composition
    protected Color color;

    protected Shape(Color c){
        this.color = c;
    }

    public abstract void applyColor();
}
