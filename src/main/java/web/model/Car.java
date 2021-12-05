package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private String countDoors;

    public Car() {
    }

    public Car(String model, String color, String countDoors) {
        this.model = model;
        this.color = color;
        this.countDoors = countDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(String countDoors) {
        this.countDoors = countDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", countDoors='" + countDoors + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor()) && Objects.equals(getCountDoors(), car.getCountDoors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getColor(), getCountDoors());
    }
}
