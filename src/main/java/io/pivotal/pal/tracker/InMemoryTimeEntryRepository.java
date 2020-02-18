package io.pivotal.pal.tracker;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

   HashMap<Long, TimeEntry> map = new HashMap<Long, TimeEntry>();

   Long counter =1L;
    TimeEntry timeEntry;
    @Override
    public TimeEntry create(TimeEntry timeEntry) {

        timeEntry.setId(counter);
        map.put(timeEntry.getId(),timeEntry);

        ++counter;
        return timeEntry;
    }


    public TimeEntry find(Long timeEntryId) {
       return map.get(timeEntryId);
    }

    public List<TimeEntry> list() {
       List<TimeEntry> timeEntryList = new ArrayList<TimeEntry>(map.values());
        //timeEntryList.add(map.get(counter));

        return timeEntryList;
    }

    public void delete(Long id) {

        map.remove(id);

    }

    public TimeEntry update(Long l, TimeEntry timeEntry) {
        TimeEntry timeEntryUpdate =new TimeEntry();
        timeEntryUpdate=map.get(l);

        if(timeEntryUpdate == null ) return null;

        timeEntryUpdate.setId(l);
        timeEntryUpdate.setProjectId(timeEntry.getProjectId());
        timeEntryUpdate.setUserId(timeEntry.getUserId());
        timeEntryUpdate.setDate(timeEntry.getDate());
        timeEntryUpdate.setHours(timeEntry.getHours());

        return timeEntryUpdate;

    }
}
