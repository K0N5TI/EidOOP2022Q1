public class IEvent implements IEventQueue.Entry {
    private Double time;
    private String event;

    public IEvent(Double time, Object event) {
        this.time = time;
        this.event = event.toString();
    }

    public Double getTime() {
        return time;
    }

    public String getEvent(){
        return event;
    }
}
