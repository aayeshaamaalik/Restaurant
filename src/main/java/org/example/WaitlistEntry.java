package org.example;

import java.time.LocalDateTime;

public class WaitlistEntry {
    private Party party;
    private LocalDateTime timeJoined;

    public WaitlistEntry(Party party) {
        this.party = party;
        this.timeJoined = LocalDateTime.now();
    }

    public Party getParty() {
        return party;
    }

    public LocalDateTime getTimeJoined() {
        return timeJoined;
    }

    @Override
    public String toString() {
        return "Party of " + party.getSize() + " (joined at " + timeJoined + ")";
    }
}

