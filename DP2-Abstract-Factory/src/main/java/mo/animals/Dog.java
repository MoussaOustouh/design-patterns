package mo.animals;

public class Dog extends Animal {

    public Dog() {
        super.setType("DOG");
    }

    @Override
    public String makeNoise() {
        return "BARK";
    }
}
