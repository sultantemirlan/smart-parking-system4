package com.parking.service;

public class TariffConfig {
    private static TariffConfig instance;
    private double hourlyRate = 500.0;

    private TariffConfig() {}

    public static synchronized TariffConfig getInstance() {
        if (instance == null) {
            instance = new TariffConfig();
        }
        return instance;
    }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double rate) { this.hourlyRate = rate; }
}