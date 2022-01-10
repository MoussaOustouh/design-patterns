package mo.animals;

import java.time.LocalDate;

/**
 * {@link Dog} class extending {@link Animal} class, and implementing
 * the {@link Animal#makeNoise()} method.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class Dog extends Animal {

    public Dog(String name, LocalDate birthDate) {
        super.setType(AnimalType.DOG);
        super.setName(name);
        super.setBirthDate(birthDate);
    }

    @Override
    public String makeNoise() {
        return "BARK";
    }
}
