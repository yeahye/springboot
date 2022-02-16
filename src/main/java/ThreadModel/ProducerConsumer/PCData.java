package ThreadModel.ProducerConsumer;

/**
 * @Auther: yejunnan
 * @Date: 2018/10/18 10:33
 * @Description:
 */
public final class PCData {
    private final int intData;
    public PCData(int d) {
        intData = d;
    }
    public PCData(String d) {
        intData = Integer.valueOf(d);
    }
    public int getData() {
        return intData;
    }

    public String toString() {
        return "data:" + intData;
    }

}
