package mo;

import mo.animals.Animal;
import mo.colors.Color;
import mo.factories.AnimalFactory;
import mo.factories.ColorFactory;
import mo.factories.FactoryProvider;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = (AnimalFactory) FactoryProvider.getFactory("Animal");
        ColorFactory colorFactory = (ColorFactory) FactoryProvider.getFactory("Color");


        Color c1 = colorFactory.create("BLACK");
        System.out.println(String.format("c1 - name : %s & hex : %s", c1.getName(), c1.getHex()));

        Color c2 = colorFactory.create("WHITE");
        System.out.println(String.format("c2 - name : %s & hex : %s", c2.getName(), c2.getHex()));

        Color c3 = colorFactory.create("RED");
        System.out.println(String.format("c3 - name : %s & hex : %s", c3.getName(), c3.getHex()));

        System.out.println("----------------------------------------------------------------");

        Animal a1 = animalFactory.create("DOG");
        System.out.println(String.format("a1 - type : %s & noise : %s", a1.getType(), a1.makeNoise()));

        Animal a2 = animalFactory.create("CAT");
        System.out.println(String.format("a2 - type : %s & noise : %s", a2.getType(), a2.makeNoise()));
    }
}
