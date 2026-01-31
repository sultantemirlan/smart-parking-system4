package com.parking.repository;

import java.util.List;

public interface IRepository<T> {
    void add(T item);
    List<T> getAll();
    void delete(int id);
}