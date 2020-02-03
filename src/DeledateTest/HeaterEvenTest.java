package DeledateTest;

/**
 * @ClassName HeaterEvenTest
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/17 11:34
 * @Version 1.0
 **/
public class HeaterEvenTest {
    public static void main(String[] args) {
        Integer temperature = 98;
        NotifierHeader notifierHeader = new NotifierHeader();
        notifierHeader.addListener(new AlarmListener(), "alertWarn", temperature);
        notifierHeader.addListener(new DisplayListener(), "showTemperature", temperature);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        notifierHeader.boilWater(temperature);
    }
}
