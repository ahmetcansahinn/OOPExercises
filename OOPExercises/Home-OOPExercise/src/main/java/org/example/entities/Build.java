package org.example.entities;

public class Build {
    private int homeId;
    private String buildType;
    private int buildPrice;
    private int squareMeter;

    public Build() {
    }

    public Build(int homeId, String buildType, int buildPrice, int squareMeter) {
        this.homeId = homeId;
        this.buildType = buildType;
        this.buildPrice = buildPrice;
        this.squareMeter = squareMeter;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public int getBuildPrice() {
        return buildPrice;
    }

    public void setBuildPrice(int buildPrice) {
        this.buildPrice = buildPrice;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }
}
