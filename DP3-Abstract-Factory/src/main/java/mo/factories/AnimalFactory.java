package mo.factories;

import mo.animals.Animal;
import mo.animals.Cat;
import mo.animals.Dog;

/**
 * <em><u>Factory method pattern</u></em>
 * <br><br>
 * The Factory class {@link AnimalFactory} which have the responsibility of create
 * {@link Animal} using the {@link AnimalFactory#create(String)} method.
 * <br><br>
 * @author Moussa OUSTOUH
 * */

public class AnimalFactory implements AbstractFactory<Animal> {
    public Animal create(String type) {
        if("DOG".equals(type)) {
            return new Dog();
        }
        else if ("CAT".equals(type)) {
            return new Cat();
        }
        else {
            return null;
        }
    }
}
