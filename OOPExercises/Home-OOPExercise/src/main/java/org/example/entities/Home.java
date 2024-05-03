package org.example.entities;

import org.example.entities.Build;

public class Home extends Build {
    public Home() {
    }

    public Home(int homeId, String buildType, int buildPrice, int squareMeter) {
        super(homeId, buildType, buildPrice, squareMeter);
    }

}
