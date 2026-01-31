package com.parking.models;

public class StandardSpot extends ParkingSpot {
    public StandardSpot(int spotNumber) {
        super(spotNumber);
    }

    @Override
    public String getSpotType() {
        return "STANDARD";
    }
}