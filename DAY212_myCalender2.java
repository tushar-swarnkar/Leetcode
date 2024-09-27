import java.util.ArrayList;
import java.util.List;

public class DAY212_myCalender2 {
    List<Event> overLapBookings;
    List<Event> bookings;

    public void MyCalendar2() {
        overLapBookings = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        for (Event e : overLapBookings) {
            if (isOverlap(e, start, end))
                return false;
        }

        for (Event e : bookings) {
            if (isOverlap(e, start, end)) {
                overLapBookings.add(getOverlapEvent(e, start, end));
            }
        }
        bookings.add(new Event(start, end));

        return true;
    }

    public boolean isOverlap(Event e, int start, int end) {
        return Math.max(e.start, start) < Math.min(e.end, end);
    }

    public Event getOverlapEvent(Event e, int start, int end) {
        return new Event(Math.max(e.start, start), Math.min(e.end, end));
    }
}

class Event {
    int start;
    int end;

    public Event(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
