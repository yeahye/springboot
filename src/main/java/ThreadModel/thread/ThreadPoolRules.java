package ThreadModel.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yejunnan
 * @version 1.0
 * @className ThreadPoolRules
 * @date 2021/3/1 9:51
 */
public class ThreadPoolRules {

    /**
     * 执行规律，corePoolsize->塞进队列->maxPoolSize
     *
     * @param []
     * @return
     */
    public static void run() {
        BlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 4, 10, TimeUnit.MINUTES, arrayBlockingQueue);
        threadPoolExecutor.submit(() -> {
            while (true) {
                try {
                    int activeCount = threadPoolExecutor.getActiveCount();
                    System.out.println("thread1 activeCount:" + activeCount);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolExecutor.submit(() -> {
            while (true) {
                try {
                    int activeCount = threadPoolExecutor.getActiveCount();
                    System.out.println("thread2 activeCount:" + activeCount + "arrayBlockingQueue.size():" + arrayBlockingQueue.size());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolExecutor.submit(() -> {
            while (true) {
                try {
                    int activeCount = threadPoolExecutor.getActiveCount();
                    System.out.println("thread3 activeCount:" + activeCount + "arrayBlockingQueue.size():" + arrayBlockingQueue.size());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolExecutor.submit(() -> {
            while (true) {
                try {
                    int activeCount = threadPoolExecutor.getActiveCount();
                    System.out.println("thread4 activeCount:" + activeCount + "arrayBlockingQueue.size():" + arrayBlockingQueue.size());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolExecutor.submit(() -> {
            while (true) {
                try {
                    int activeCount = threadPoolExecutor.getActiveCount();
                    System.out.println("thread5 activeCount:" + activeCount + "arrayBlockingQueue.size():" + arrayBlockingQueue.size());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolExecutor.submit(() -> {
            while (true) {
                try {
                    int activeCount = threadPoolExecutor.getActiveCount();
                    System.out.println("thread6 activeCount:" + activeCount + "arrayBlockingQueue.size():" + arrayBlockingQueue.size());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
