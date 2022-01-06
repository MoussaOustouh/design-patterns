package mo.builders;

/**
 * @author Moussa OUSTOUH
 * */
public class Car {
    private final String brand;
    private final String model;
    private final Integer year;
    private final String color;
    private final String description;

    /**
     * The scope of the {@link Car#Car} constructor has been changed to private, so that it cannot be
     * accessed from the outside of the {@link Car} class. This makes it impossible to create a {@link Car}
     * instance directly. The object creation process is delegated to the {@link Builder} class.
     * <br><br>
     * The Book constructor takes a {@link Builder} instance as its only parameter, which contains
     * all the values to be set by the {@link Car#Car(Builder)} constructor. Alternatively, the Car constructor
     * could take all the parameters corresponding to the {@link Car} fields, but this would mean that you must deal
     * with many parameters to be set in the right order when you call the {@link Car} constructor from the
     * {@link Builder}’s {@link Builder#build()} method.
     * <br>
     * Mixing up parameters of the same type is one of the potential issues developers try to avoid by implementing
     * the <code>Builder</code> pattern.
     *
     * @param builder
     *        {@link Builder} instance
     * */
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.description = builder.description;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    /**
     * The {@link Builder} class contains the same fields as the {@link Car} class, which is
     * necessary to hold the values to be passed to the {@link Car} constructor.
     * */
    public static class Builder {
        /**
         * {@link Builder#brand} and {@link Builder#model} are mandatory fields.
         * */
        private final String brand;
        private final String model;


        /**
         * {@link Builder#year}, {@link Builder#color} and {@link Builder#description} are optionals.
         * */
        private Integer year;
        private String color;
        private String description;

        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        /**
         * For every optional field ({@link Builder#year}, {@link Builder#color} and {@link Builder#description})
         * to be set, the {@link Builder} class exposes a setter-like method
         * ({@link Builder#year(Integer)}, {@link Builder#color(String)} and {@link Builder#description(String)}),
         * which assigns the field’s value and returns the current {@link Builder} instance to build the object
         * in a fluent way.
         * <br>
         * Since each method call returns the same {@link Builder} instance, method calls can be chained,
         * which makes the client code more concise and readable.
         * */
        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The {@link Builder#build()} method calls the {@link Car#Car(Builder)} constructor
         * by passing the current {@link Builder} instance as the only parameter.
         * The values held by the {@link Builder} instance are then unpacked by the {@link Car#Car(Builder)}
         * constructor, which assigns them to the corresponding {@link Car} fields.
         * <br>
         * @return {@link Car} instance
         * */
        public Car build() {
            return new Car(this);
        }
    }
}
