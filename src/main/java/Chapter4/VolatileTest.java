package Chapter4;

/**
 * @Auther: yejunnan
 * @Date: 2018/11/5 15:21
 * @Description:
 */
public class VolatileTest extends Thread{
    private volatile boolean stop = false;
    private static boolean testBool;

    public void stopMe() {
        stop = true;
    }

    @Override
    public void run() {
        int i = 0;
        while(!stop) {
            i++;
        }
        System.out.println("i=" + i);
    }

    public static void main(String[] args) {

        try {
            VolatileTest volatileTest = new VolatileTest();
            volatileTest.start();
            Thread.sleep(1000);
//            volatileTest.stopMe();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }
}