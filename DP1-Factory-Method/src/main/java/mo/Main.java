package mo;

import mo.animals.Animal;
import mo.animals.AnimalType;
import mo.factories.AnimalFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.createAnimal(AnimalType.CAT, "CESAR", LocalDate.of(2021, 10, 20));
        System.out.println("A1 : " + a1.toString());
        System.out.println("A1 makeNoise : " + a1.makeNoise());

        Animal a2 = AnimalFactory.createAnimal(AnimalType.DOG, "OSCAR", LocalDate.of(2018, 3, 6));
        System.out.println("A2 : " + a2.toString());
        System.out.println("A2 makeNoise : " + a2.makeNoise());
    }
}
