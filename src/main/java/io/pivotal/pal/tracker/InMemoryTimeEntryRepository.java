package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {
    HashMap<Long, TimeEntry> list = new HashMap<Long, TimeEntry>();
    private Long count = 0L;
    public TimeEntry create(TimeEntry timeEntry) {

        if (timeEntry.getId() == 0L){
            timeEntry.setId(++count);
        }


        this.list.put(count, timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        TimeEntry timeEntry = this.list.get(id);
        return timeEntry;
    }

    public List<TimeEntry> list() {
        return new ArrayList<TimeEntry>(list.values());
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        timeEntry.setId(id);
        this.list.put(id, timeEntry);
        return timeEntry;
    }

    public void delete(long id) {
        this.list.remove(id);
    }
}
