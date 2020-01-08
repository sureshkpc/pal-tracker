package io.pivotal.pal.tracker;

import java.util.List;

public class InMemoryTimeEntryRepository {

    public TimeEntry create(TimeEntry timeEntry) {

        return timeEntry;
    }

    public TimeEntry find(long timeEntryId) {

        return null;
    }

    public List<TimeEntry> list() {

        return list();
    }

    public void delete(long id) {
    }

    public TimeEntry update(long l, TimeEntry timeEntry) {
        return timeEntry;

    }
}
