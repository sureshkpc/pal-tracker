package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {

    private TimeEntry TimeEntry;
    private TimeEntryRepository TimeEntryRepo;
    private ResponseEntity timeEntryToCreate;

    public io.pivotal.pal.tracker.TimeEntry getTimeEntry() {
        return TimeEntry;
    }

    public void setTimeEntry(io.pivotal.pal.tracker.TimeEntry timeEntry) {
        TimeEntry = timeEntry;
    }

    public TimeEntryController(io.pivotal.pal.tracker.TimeEntry timeEntry) {
        TimeEntry = timeEntry;
    }

    public TimeEntryRepository getTimeEntryRepo() {
        return TimeEntryRepo;
    }

    public void setTimeEntryRepo(TimeEntryRepository timeEntryRepo) {
        TimeEntryRepo = timeEntryRepo;
    }

    public TimeEntryController(TimeEntryRepository timeEntryRepo) {
        TimeEntryRepo = timeEntryRepo;
    }

    public ResponseEntity create(io.pivotal.pal.tracker.TimeEntry timeEntryToCreate) {

        return null;
    }

    public ResponseEntity<io.pivotal.pal.tracker.TimeEntry> read(long timeEntryId) {
        return null;
    }

    public ResponseEntity<List<io.pivotal.pal.tracker.TimeEntry>> list() {
        return null;
    }

    public ResponseEntity update(long timeEntryId, io.pivotal.pal.tracker.TimeEntry expected) {
        return null;
    }

    public ResponseEntity delete(long timeEntryId) {
        return null;
    }
}
