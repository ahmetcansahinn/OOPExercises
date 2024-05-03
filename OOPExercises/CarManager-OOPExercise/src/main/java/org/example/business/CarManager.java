package org.example.business;

import org.example.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarManager implements Impl {
    private List<Car> cars;

    public CarManager() {
        this.cars = new ArrayList<>();
    }

    public CarManager(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);

    }

    @Override
    public List<Car> getAll() {
        cars.stream()
                .forEach(car -> {
                    System.out.println(car.getCarId() + " numaralı id'ye sahip " + car.getBrand() +
                            " marka araç listelendi.");
                        }
                );
        return cars;
    }

    @Override
    public Double priceOf100km() {
        cars.stream()
                .forEach(car -> {
                    System.out.println(car.getBrand() + " marka araç 100 km'de " + car.getFuelConsumption() * 42
                            + " tl yakıt tüketmektedir.");
                });
        return null;
    }

    @Override
    public void nonLimiter(int carId, int speedBoost) {
        cars.stream()
                .filter(car -> car.getCarId() == carId)
                .findFirst()
                .ifPresentOrElse(
                        car -> {
                            car.setSpeed(car.getSpeed() + speedBoost);
                            System.out.println("Araç hız arttırma isteği gerçekleştirildi: " + speedBoost + " yeni hızınız: " + car.getSpeed());
                        },
                        () -> System.out.println("Sistemde böyle bir araç bulunamadı")
                );
    }

    @Override
    public void rentACar(int carId, String renter) {
        Car carToRent = findCarById(carId);
        if (carToRent != null) {
                carToRent.setRented(true);
                carToRent.setRenter(renter);
                System.out.println("Araç kiralama işlemi başarılı. Yeni sahibini: " + renter);
            } else {
                System.out.println("Böyle bir araç bulunamadı.");
            }
        }


    private Car findCarById(int carId) {
        return cars.stream()
                .filter(car -> car.getCarId() == carId)
                .findFirst()
                .orElse(null);
    }
}





