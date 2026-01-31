package com.parking.service;

@FunctionalInterface
public interface CostCalculator {
    double calculate(double hours, double rate);
}