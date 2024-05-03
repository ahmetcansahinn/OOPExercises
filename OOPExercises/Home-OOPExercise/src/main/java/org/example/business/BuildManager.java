package org.example.business;

import org.example.entities.Build;
import org.example.entities.Home;
import org.example.entities.SummerResort;
import org.example.entities.Villa;

import java.util.ArrayList;
import java.util.List;

public class BuildManager implements Imp {

   @Override
   public List<Build> getAll(List<Build> builds) {


for (Build build: builds){
   System.out.println(build.getHomeId() + " numaralı id'ye sahip" + " " + build.getBuildType() + " listelendi");
}
      return new ArrayList<>();
   }

    @Override
    public void getTotalPricesHomes(List<Build> builds) {
       double totalPriceHomes=builds.stream()
               .filter(build -> build.getBuildType().equals("Ev"))
               .mapToInt(Build::getBuildPrice).sum();
       double totalPriceSummerResorts=0.0;
       double totalPriceVilla=0.0;
       for (Build build:builds){
           if(build instanceof Home) {
               totalPriceHomes += build.getBuildPrice();
           }else if(build instanceof SummerResort){
               totalPriceSummerResorts+=build.getBuildPrice();

           }else if(build instanceof Villa){
               totalPriceVilla+=build.getBuildPrice();

           }
       }
       System.out.println("Evlerin toplam fiyatı: " + totalPriceHomes);
        System.out.println("Yazlıkların toplam fiyatı: " + totalPriceSummerResorts);
        System.out.println("Villaların toplam fiyatı: " + totalPriceVilla);



    }

    @Override
    public void totalPricesBuilds(List<Build> builds) {
        double totalPrices=0.0;
        for (Build build: builds){
            totalPrices+=build.getBuildPrice();
        }
        System.out.println("Bütün yapıların toplam fiyatı: " + totalPrices);
    }

    @Override
    public void getTotalSquareMeters(List<Build> builds) {
        double totalSquareMeterHomes=0.0;
        double totalSquareMeterSummerResorts=0.0;
        double totalSquareMeterVilla=0.0;
        for (Build build:builds){
            if(build instanceof Home) {
                totalSquareMeterHomes += build.getSquareMeter();
            }else if(build instanceof SummerResort){
                totalSquareMeterSummerResorts+=build.getSquareMeter();

            }else if(build instanceof Villa){
                totalSquareMeterVilla+=build.getSquareMeter();

            }
        }
        System.out.println("Evlerin toplam metrakeresi: " + totalSquareMeterHomes);
        System.out.println("Yazlıkların toplam metrekaresi: " + totalSquareMeterSummerResorts);
        System.out.println("Villaların toplam metrekaresi: " + totalSquareMeterVilla);

    }

    @Override
    public void getTotalSquareMetersBuilds(List<Build> builds) {
        double totalSquareMeters=0.0;
        for (Build build:builds){
            totalSquareMeters+=build.getSquareMeter();
        }
        System.out.println("Bütün yapıların toplam metrekaresi: " + totalSquareMeters);

    }


}
