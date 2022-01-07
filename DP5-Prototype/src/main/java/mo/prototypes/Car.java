package mo.prototypes;

/**
 * The {@link Car} class implementing {@link PrototypeInterface} interface and {@link PrototypeInterface#cloneInstance()} method.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class Car implements PrototypeInterface<Car> {
    private String brand;
    private String model;
    private Integer year;
    private String color;
    private String description;

    public Car() {
    }

    public Car(String brand, String model, Integer year, String color, String description) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
     * The {@link PrototypeInterface#cloneInstance()} implementation return a new {@link Car} with the fields values.
     * */
    @Override
    public Car cloneInstance() {
        return new Car(this.brand, this.model, this.year, this.color, this.description);
    }
}
