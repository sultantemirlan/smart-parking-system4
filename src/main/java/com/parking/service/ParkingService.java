package com.parking.service;

import com.parking.models.Vehicle;
import com.parking.repository.IRepository;
import java.util.List;

public class ParkingService implements IParkingService {
    private final IRepository<Vehicle> repository;

    public ParkingService(IRepository<Vehicle> repository) {
        this.repository = repository;
    }

    @Override
    public void registerVehicle(String plate, String type) {
        Vehicle vehicle = new Vehicle(plate, type);
        repository.add(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return repository.getAll();
    }

    @Override
    public double calculateStayCost(double hours, double rate) {
        // Вот твоя лямбда! Она применяет скидку 10%, если стоишь больше 5 часов
        CostCalculator calculator = (h, r) -> (h > 5) ? (h * r * 0.9) : (h * r);
        return calculator.calculate(hours, rate);
    }
}