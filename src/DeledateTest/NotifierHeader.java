package DeledateTest;

/**
 * @ClassName NotifierHeader
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/17 11:36
 * @Version 1.0
 **/
public class NotifierHeader extends Notifier{
//    private EventHeader eventHeader;
    private Integer temperature;
    public void boilWater(Integer warningTemperature) {
        for (int i = 0; i <100 ; i++) {
            this.temperature = i;
            if (warningTemperature < temperature) {
                notifyAllListeners();
                break;
            }

        }

    }


    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("Listener需要Notifier帮忙放哨");
        EventHeader eventHeader = this.getEventHeader();
        eventHeader.addEvent(object, methodName, args);


    }

    @Override
    public void notifyAllListeners() {
        System.out.println("尽职尽责的Notifier给所有的Listener通知");
        try {
            this.getEventHeader().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
