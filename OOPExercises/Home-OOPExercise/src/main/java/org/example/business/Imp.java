package org.example.business;

import org.example.entities.Build;

import java.util.List;

public interface Imp {
    List<Build> getAll(List<Build> builds);
    void getTotalPricesHomes(List<Build> builds);
    void totalPricesBuilds(List<Build> builds);
    void getTotalSquareMeters(List<Build> builds);
    void getTotalSquareMetersBuilds(List<Build> builds);

}
