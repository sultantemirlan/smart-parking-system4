package org.example;

import com.parking.factory.SpotFactory;
import com.parking.models.*;
import com.parking.service.TariffConfig;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Milestone 2: Design Patterns Demo ===\n");

        // 1. Singleton: Устанавливаем единый тариф для всей системы
        TariffConfig config = TariffConfig.getInstance();
        config.setHourlyRate(750.0);
        System.out.println("Global Tariff set to: " + config.getHourlyRate() + " tg/hour");

        // 2. Factory: Создаем разные типы мест через 'завод'
        ParkingSpot standard = SpotFactory.createSpot(10, "standard");
        ParkingSpot electric = SpotFactory.createSpot(20, "electric");
        ParkingSpot disabled = SpotFactory.createSpot(30, "disabled");

        // 3. Generics: Упаковываем разные места в универсальный ListResult<T>
        ListResult<ParkingSpot> spotResults = new ListResult<>(
                Arrays.asList(standard, electric, disabled)
        );

        System.out.println("\nSpots generated via Factory (Count: " + spotResults.getCount() + "):");
        for (ParkingSpot s : spotResults.getItems()) {
            System.out.println("Spot #" + s.getSpotNumber() + " | Type: " + s.getSpotType());
        }

        // 4. Builder: Создаем сложную сессию парковки пошагово
        ParkingSession session = new ParkingSession.Builder()
                .setPlate("KZ001VIP")
                .setSpotNumber(electric.getSpotNumber())
                .setStartTime(LocalDateTime.now())
                .build();

        System.out.println("\nSession details (created via Builder):");
        System.out.println(session.toString());
    }
}