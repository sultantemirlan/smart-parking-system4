package com.parking.service;

import com.parking.models.Vehicle;
import java.util.List;

public interface IParkingService {
    void registerVehicle(String plate, String type);
    List<Vehicle> getAllVehicles();
    double calculateStayCost(double hours, double rate);
}