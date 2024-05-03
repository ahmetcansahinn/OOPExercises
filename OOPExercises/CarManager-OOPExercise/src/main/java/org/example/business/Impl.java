package org.example.business;

import org.example.entities.Car;

import java.util.List;

public interface Impl {
    void add(Car car);
    List<Car> getAll();
    Double priceOf100km();
    void nonLimiter(int carId, int speedBoost);
    void rentACar(int carId,String renter);
//    Car findById(int carId);
}
