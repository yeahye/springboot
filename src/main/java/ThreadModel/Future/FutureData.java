package ThreadModel.Future;

/**
 * @Auther: yejunnan
 * @Date: 2018/10/17 14:09
 * @Description:
 */
public class FutureData implements Data {
    protected RealData realData = null;
    protected boolean isReady = false;

    public synchronized void setRealData(RealData realData) {
        if(isReady) {
            return;
        }
        this.realData = realData;
        isReady = true;
        notifyAll();
    }

    @Override
    public synchronized String getResult() {
        while (!isReady) {
            try{
                wait();
            } catch (InterruptedException e) {
            }
        }
        return realData.result;
    }

}
