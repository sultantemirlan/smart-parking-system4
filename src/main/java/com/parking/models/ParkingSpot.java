package com.parking.models;

public abstract class ParkingSpot {
    private int id;
    private int spotNumber;
    private boolean isOccupied;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
    }

    public abstract String getSpotType(); // Абстрактный метод для типов

    public int getSpotNumber() { return spotNumber; }
    public boolean isOccupied() { return isOccupied; }
    public void setOccupied(boolean occupied) { isOccupied = occupied; }
}