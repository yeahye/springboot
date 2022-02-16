package ThreadModel.Future;

/**
 * @Auther: yejunnan
 * @Date: 2018/10/17 13:39
 * @Description:
 */
public class Client {
    public Data request(final String queryStr) {
        final FutureData futureData = new FutureData();
        new Thread() {
            public void run() {
                RealData realData = new RealData(queryStr);//这个比较耗时
                futureData.setRealData(realData);
            }
        }.start();
        return futureData;
    }
}