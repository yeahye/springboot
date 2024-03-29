package ThreadModel.Future;

/**
 * @Auther: yejunnan
 * @Date: 2018/10/17 14:11
 * @Description:
 */
public class RealData implements Data {
    protected final String result;
    public RealData(String para) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append(para);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        result = sb.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}
