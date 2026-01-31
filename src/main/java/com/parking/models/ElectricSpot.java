package com.parking.models;

public class ElectricSpot extends ParkingSpot {
    public ElectricSpot(int spotNumber) {
        super(spotNumber);
    }

    @Override
    public String getSpotType() {
        return "ELECTRIC";
    }
}