package com.parking.models;

public class DisabledSpot extends ParkingSpot {
    public DisabledSpot(int spotNumber) {
        super(spotNumber);
    }

    @Override
    public String getSpotType() {
        return "DISABLED";
    }
}