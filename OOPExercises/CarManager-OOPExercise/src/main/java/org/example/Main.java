package org.example;


import org.example.business.CarManager;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) {

        CarManager carManager=new CarManager();

        carManager.add(new Car(1,"Fiat","Egea",4,155,false,"" ));
        carManager.add(new Car(2,"Dacia","Sandero",6,123,false,"" ));
        carManager.add(new Car(3,"Citroen","c3",3,144,false,"" ));
        carManager.add(new Car(4,"Tesla","Sports",0,222,false,"" ));

        System.out.println("--------Araç Listesi-------");
        carManager.getAll();
        System.out.println("--------Yakıt Tüketimi-------");
        carManager.priceOf100km();
        System.out.println("--------Hız arttırma-------");
        carManager.nonLimiter(1,22);
        System.out.println("--------Araç Kiralama-------");
        carManager.rentACar(2,"Cemil Bey");


    }
}