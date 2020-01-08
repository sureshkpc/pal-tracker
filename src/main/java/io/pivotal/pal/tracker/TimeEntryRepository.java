package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    void create(TimeEntry timeEntryToCreate);
    TimeEntry find(Long timeEntryId);

    List<TimeEntry> list();

    void update(long eq, TimeEntry any);

    void delete(long timeEntryId);
}
