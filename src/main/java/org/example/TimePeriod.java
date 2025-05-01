package org.example;

import java.time.LocalTime;

public class TimePeriod {
    private LocalTime start;
    private LocalTime end;

    public TimePeriod(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public boolean overlapsWith(TimePeriod other) {
        return !(end.isBefore(other.start) || start.isAfter(other.end));
    }

    @Override
    public String toString() {
        return start + " - " + end;
    }
}

