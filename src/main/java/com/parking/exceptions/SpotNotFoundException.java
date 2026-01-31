package com.parking.exceptions;

public class SpotNotFoundException extends ParkingException {
    public SpotNotFoundException(String message) {
        super(message);
    }
}