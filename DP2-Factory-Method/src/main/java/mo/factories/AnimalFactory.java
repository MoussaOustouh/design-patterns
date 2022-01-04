package mo.factories;

import mo.animals.Animal;
import mo.animals.AnimalType;
import mo.animals.Cat;
import mo.animals.Dog;

import java.time.LocalDate;

/**
 * The Factory class {@link AnimalFactory} which have the responsibility of create 
 * {@link Animal} using the {@link AnimalFactory#createAnimal(AnimalType, String, LocalDate)} method.
 * <br><br>
 * @author Moussa OUSTOUH
 * */

public class AnimalFactory {
    public static Animal createAnimal(AnimalType type, String name, LocalDate birthDate) {
        if(type == AnimalType.DOG) {
            return new Dog(name, birthDate);
        }
        else if (type == AnimalType.CAT) {
            return new Cat(name, birthDate);
        }
        else {
            return null;
        }
    }
}
