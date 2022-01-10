package mo;

import mo.native_clone.Person;
import mo.prototypes.Car;

import java.time.LocalDate;
import java.util.Random;

public class Main implements Cloneable {
    public static void main(String[] args) {
        System.out.println("\n\n#---- Test Prototype pattern ------------------------------------------");
        Car car = new Car("Ford", "Shelby Mustang GT-500", 2022, "Black", "Just waw!");
        System.out.println("car : " + car);
        System.out.println("car hashCode : " + car.hashCode());

        Car carClone = car.cloneInstance();
        System.out.println("car clone : " + carClone);
        System.out.println("car clone hashCode : " + carClone.hashCode());


        System.out.println("\n\n#---- Java native cloning ---------------------------------------------");
        Person person = new Person("Moussa", "OUSTOUH", LocalDate.of(new Random().nextInt(2021), 1,1));
        System.out.println("person : " + person);
        System.out.println("person hashCode : " + person.hashCode());

        try {
            Person personClone = (Person) person.clone();
            System.out.println("personClone : " + personClone);
            System.out.println("personClone hashCode : " + personClone.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
