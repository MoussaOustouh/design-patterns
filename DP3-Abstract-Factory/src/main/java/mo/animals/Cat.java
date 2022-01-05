package mo.animals;

public class Cat extends Animal {

    public Cat() {
        super.setType("CAT");
    }

    @Override
    public String makeNoise() {
        return "MEOW";
    }
}
