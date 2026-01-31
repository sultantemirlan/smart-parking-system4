package com.parking.models;

import java.util.List;

public class ListResult<T> {
    private List<T> items;
    private int count;

    public ListResult(List<T> items) {
        this.items = items;
        this.count = items.size();
    }

    public List<T> getItems() { return items; }
    public int getCount() { return count; }
}