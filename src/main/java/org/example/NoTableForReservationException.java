package org.example;

public class NoTableForReservationException extends Exception {
    public NoTableForReservationException(String message) {
        super(message);
    }
}

