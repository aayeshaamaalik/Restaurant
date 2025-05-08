package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private Queue<WaitlistEntry> waitlist = new LinkedList<>();

    public void addToWaitlist(Party party) {
        waitlist.offer(new WaitlistEntry(party));
    }

    public WaitlistEntry getNextParty() {
        return waitlist.poll(); // Returns and removes the head
    }

    public boolean isEmpty() {
        return waitlist.isEmpty();
    }

    public Queue<WaitlistEntry> getWaitlist() {
        return waitlist;
    }
}

