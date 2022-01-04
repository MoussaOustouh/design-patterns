package mo.animals;

import java.time.LocalDate;

/**
 * {@link Cat} class extending {@link Animal} class, and implementing
 * the {@link Animal#makeNoise()} method.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class Cat extends Animal {

    public Cat(String name, LocalDate birthDate) {
        super.setType(AnimalType.CAT);
        super.setName(name);
        super.setBirthDate(birthDate);
    }

    @Override
    public String makeNoise() {
        return "MEOW";
    }
}
