package com.walking.lesson19_object_methods.Task1.model;

public class Car {
    private String model;
    private String number;
    private String color;
    private String VIN;

    public Car(String model, String color, String number, String VIN){
        setColor(color);
        setModel(model);
        setNumber(number);
        setVIN(VIN);
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        if (getNumber() != null ? !getNumber().equals(car.getNumber()) : car.getNumber() != null) return false;
        if (getColor() != null ? !getColor().equals(car.getColor()) : car.getColor() != null) return false;
        return getVIN() != null ? getVIN().equals(car.getVIN()) : car.getVIN() == null;
    }

    @Override
    public int hashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getVIN() != null ? getVIN().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", VIN='" + VIN + '\'' +
                '}';
    }
}
