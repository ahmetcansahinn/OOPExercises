package org.example.entities;

public class Car {
    private int carId;
    private String Brand;
    private String model;
    private int fuelConsumption;
    private int speed;
    private boolean isRented;
    private String renter;


    public Car() {
    }

    public Car(int carId, String brand, String model, int fuelConsumption, int speed, boolean isRented, String renter) {
        this.carId = carId;
        Brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.isRented = false;
        this.renter = " ";
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }
}
