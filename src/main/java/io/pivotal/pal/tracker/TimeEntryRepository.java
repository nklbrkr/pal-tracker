package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {

    public TimeEntry create(TimeEntry timeEntry);

    public TimeEntry find(long timeEntryId);

    public List<TimeEntry> list();

    public TimeEntry update(long id, TimeEntry timeEntry);

    public void delete(long timeEntryId);
}



/*
public class TimeEntryRepository {

    private HashMap<Long, TimeEntry> list = new HashMap<Long, TimeEntry>();
    private Long id = 0L;

    public TimeEntry create(TimeEntry timeEntry) {
        if(timeEntry.getId() == 0L){
            timeEntry.setId(++this.id);
        }
        list.put(timeEntry.getId(), timeEntry);

        return timeEntry;
    }

    public TimeEntry find(long timeEntryId) {
        TimeEntry timeEntry = this.list.get(timeEntryId);

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

    public void delete(long timeEntryId) {
        this.list.remove(timeEntryId);
    }
}
*/