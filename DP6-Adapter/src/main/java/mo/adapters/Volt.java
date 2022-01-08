package mo.adapters;

public class Volt {
    private int value;

    public Volt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "value=" + value +
                '}';
    }
}
