package mo.animals;

public abstract class Animal {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                '}';
    }

    public abstract String makeNoise();
}
