package com.parking.models;

import java.time.LocalDateTime;

public class ParkingSession {
    private String plate;
    private int spotNumber;
    private LocalDateTime startTime;

    private ParkingSession(Builder builder) {
        this.plate = builder.plate;
        this.spotNumber = builder.spotNumber;
        this.startTime = builder.startTime;
    }

    public static class Builder {
        private String plate;
        private int spotNumber;
        private LocalDateTime startTime;

        public Builder setPlate(String plate) {
            this.plate = plate;
            return this;
        }

        public Builder setSpotNumber(int spotNumber) {
            this.spotNumber = spotNumber;
            return this;
        }

        public Builder setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public ParkingSession build() {
            return new ParkingSession(this);
        }
    }

    @Override
    public String toString() {
        return "Session for " + plate + " at spot #" + spotNumber;
    }
}