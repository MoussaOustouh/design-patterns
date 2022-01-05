package mo.factories;

import mo.colors.Black;
import mo.colors.Color;
import mo.colors.Red;
import mo.colors.White;

/**
 * <em><u>Factory method pattern</u></em>
 * <br><br>
 * The Factory class {@link ColorFactory} which have the responsibility of create
 * {@link Color} using the {@link ColorFactory#create(String)} method.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if("BLACK".equals(type)) {
            return new Black();
        }
        else if ("WHITE".equals(type)) {
            return new White();
        }
        else if ("RED".equals(type)) {
            return new Red();
        }
        return null;
    }
}
