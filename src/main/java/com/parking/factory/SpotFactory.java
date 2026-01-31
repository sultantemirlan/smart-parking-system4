package com.parking.factory;

import com.parking.models.*;

public class SpotFactory {
    public static ParkingSpot createSpot(int number, String type) {
        if (type == null) return new StandardSpot(number);

        switch (type.toUpperCase()) {
            case "DISABLED":
                return new DisabledSpot(number);
            case "ELECTRIC":
                return new ElectricSpot(number);
            default:
                return new StandardSpot(number);
        }
    }
}