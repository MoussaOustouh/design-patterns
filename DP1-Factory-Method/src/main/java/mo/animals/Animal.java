package mo.animals;

import java.time.LocalDate;

/**
 * Super class in factory design pattern can be an <code>interface</code>,
 * <code>abstract class</code> or a <code>normal java class</code>. For this
 * factory design pattern example, we have abstract super class with
 * <code>abstract method</code> {@link Animal#makeNoise()}.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public abstract class Animal {
    private AnimalType type;
    private String name;
    private LocalDate birthDate;

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public abstract String makeNoise();
}
