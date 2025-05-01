package org.example;

public class Reservation {
    private TimePeriod timePeriod;
    private Table table;

    public Reservation(TimePeriod timePeriod, Table table) {
        this.timePeriod = timePeriod;
        this.table = table;
    }

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    public Table getTable() {
        return table;
    }

    @Override
    public String toString() {
        return "Reservation at " + timePeriod + " for " + table;
    }
}

