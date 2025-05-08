package org.example;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private QueueManager queueManager = new QueueManager();
    private List<Table> tables;
    private List<Reservation> reservations;

    public Restaurant() {
        this.tables = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void addReservation(TimePeriod period, Party party) throws NoTableForReservationException {
        for (Table table : tables) {
            if (table.isAvailable() && table.getCapacity() >= party.getSize()) {
                boolean hasConflict = false;

                for (Reservation res : reservations) {
                    if (res.getTable() == table && res.getTimePeriod().overlapsWith(period)) {
                        hasConflict = true;
                        break;
                    }
                }

                if (!hasConflict) {
                    table.markUnavailable();
                    reservations.add(new Reservation(period, table));
                    return;
                }
            }
        }

        // No table found: queue the party
        System.out.println("No table available. Adding party to waitlist.");
        queueManager.addToWaitlist(party);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}

