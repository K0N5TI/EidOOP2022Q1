import java.util.ArrayList;


public class SimpleEventQueue implements IEventQueue {
    private final ArrayList<IEvent> IEvents = new ArrayList<>();


    @Override
    public void enqueue(Double time, Object event) {
        IEvents.add(new IEvent(time, event));
        IEvents.sort((o1, o2) -> Double.compare(o2.getTime(), o1.getTime()));
    }

    @Override
    public Entry dequeue() {
        int lastEntryIndex = IEvents.size() - 1;
        IEvent current_event = IEvents.get(lastEntryIndex);
        IEvents.remove(lastEntryIndex);
        return current_event;
    }

    public int size() {
        return IEvents.size();
    }
}