package DeledateTest;

/**
 * @ClassName Notifier
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/17 11:36
 * @Version 1.0
 **/
public abstract class Notifier {
    private EventHeader eventHeader = new EventHeader();
//    private EventHeader eventHeader = new EventHeader();

    public EventHeader getEventHeader() {
        return eventHeader;
    }

    public void setEventHeader(EventHeader eventHeader) {
        this.eventHeader = eventHeader;
    }

    public abstract void addListener(Object object, String methodName, Object... args);

    public abstract void notifyAllListeners();
}
