package mo;

import mo.builders.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car.Builder("Ford", "Mustang")
                .build();
        System.out.println("c1 : " + c1.toString());


        Car c2 = new Car.Builder("Ford", "Shelby Mustang GT-500")
                .year(2022)
                .color("Black")
                .description("Just waw!")
                .build();
        System.out.println("c2 : " + c2.toString());
    }
}
