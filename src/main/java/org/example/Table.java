package org.example;

public class Table {
    private boolean available;
    private int capacity;

    public Table(int capacity) {
        this.capacity = capacity;
        this.available = true; // Default to available
    }

    public boolean isAvailable() {
        return available;
    }

    public void markAvailable() {
        this.available = true;
    }

    public void markUnavailable() {
        this.available = false;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Table for " + capacity + " [" + (available ? "Available" : "Occupied") + "]";
    }
}
