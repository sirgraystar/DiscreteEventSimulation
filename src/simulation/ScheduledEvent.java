package simulation;

public class ScheduledEvent<S> implements Comparable<ScheduledEvent<S>> {

    private Event<S> event;
    private double time;

    public ScheduledEvent(Event<S> event, double time) {
        super();
        this.event = event;
        this.time = time;
    }

    public final double getTime() {
        return time;
    }

    public final Event<S> getEvent() {
        return event;
    }

    public final int compareTo(ScheduledEvent<S> comparee) {
        return Double.compare(time, comparee.time);
    }
}
