package JVM;

import java.io.ObjectOutputStream;

/**
 * @Auther: yejunnan
 * @Date: 2018/11/2 19:00
 * @Description:
 */
public class JVM5_1_2 {

    private static int count = 0;

    /**
     * 默认的JVM，xss深度是21641，设置为1M之后为12570
     */
    public static void recursion() {
        count++;
        recursion();
    }
    public static void main(String[] args) {
        //递归调用测试栈深度
//        try{
//            recursion();
//        } catch (Throwable e) {
//            System.out.println("deep of stack is " + count);
//            e.printStackTrace();
//        }
        //测试能创建多少个线程
        try {
            while (true) {
                System.out.println("count=" + count);
                Thread.sleep(3000);
                Thread thread = new Thread(() -> {
                    count++;
                    Object o = new Object();
                    synchronized (o) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        } catch (Throwable t) {
            System.out.println("创建的线程个数:" + count);
            t.printStackTrace();
        }
    }
}
