package org.example.entities;

import org.example.entities.Build;

public class Villa extends Build {
    public Villa() {
    }

    public Villa(int homeId, String buildType, int buildPrice, int squareMeter) {
        super(homeId, buildType, buildPrice, squareMeter);
    }

}
