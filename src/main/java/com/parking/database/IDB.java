package com.parking.database;

import java.sql.Connection;

public interface IDB {
    Connection getConnection();
}