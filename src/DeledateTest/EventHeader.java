package DeledateTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EventHeader
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/17 11:37
 * @Version 1.0
 **/
public class EventHeader {
    private List<Event> objects;

    public EventHeader() {
        this.objects = new ArrayList<Event>();
    }
    public void notifyX() {
        for (Event e:objects
             ) {
            try {
                e.invoke();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void addEvent(Object object,String methodName,Object...args) {
        objects.add(new Event(object, methodName, args));

    }

}
