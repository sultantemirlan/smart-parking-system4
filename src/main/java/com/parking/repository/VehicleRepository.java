package com.parking.repository;

import com.parking.database.IDB;
import com.parking.models.Vehicle;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IRepository<Vehicle> {
    private final IDB db;

    public VehicleRepository(IDB db) {
        this.db = db;
    }

    @Override
    public void add(Vehicle vehicle) {
        String sql = "INSERT INTO vehicles (license_plate, vehicle_type) VALUES (?, ?)";
        try (Connection conn = db.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, vehicle.getLicensePlate());
            st.setString(2, vehicle.getType());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles";
        try (Connection conn = db.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                vehicles.add(new Vehicle(
                        rs.getString("license_plate"),
                        rs.getString("vehicle_type")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM vehicles WHERE id = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}