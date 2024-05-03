package org.example;

import org.example.business.BuildManager;
import org.example.entities.Build;
import org.example.entities.Home;
import org.example.entities.SummerResort;
import org.example.entities.Villa;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BuildManager buildManager=new BuildManager();
        List<Build> allBuild=new ArrayList<>();
        Build build=new Home(1, "Ev", 33300,135);
        Build build2=new Home(2,"Ev", 4123000,240);
        Build build3=new Home(3,"Ev",344444,143);
        Build build4=new SummerResort(1, "Yazlık", 5210000,123);
        Build build5=new SummerResort(2,"Yazlık", 410000,165);
        Build build6=new SummerResort(3,"Yazlık",343444,136);
        Build build7=new Villa(1, "Villa", 125000,122);
        Build build8=new Villa(2,"Villa", 1520000,167);
        Build build9=new Villa(3,"Villa",5554444,188);
        allBuild.add(build);
        allBuild.add(build2);
        allBuild.add(build3);
        allBuild.add(build4);
        allBuild.add(build5);
        allBuild.add(build6);
        allBuild.add(build7);
        allBuild.add(build8);
        allBuild.add(build9);


        buildManager.getAll(allBuild);
        System.out.println("-----------------------------------------------------");
        buildManager.getTotalPricesHomes(allBuild);
        System.out.println("-----------------------------------------------------");
        buildManager.getTotalSquareMeters(allBuild);
        System.out.println("-----------------------------------------------------");
        buildManager.totalPricesBuilds(allBuild);
        System.out.println("-----------------------------------------------------");
        buildManager.getTotalSquareMetersBuilds(allBuild);

    }
}