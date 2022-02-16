package ThreadModel.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Auther: yejunnan
 * @Date: 2018/10/18 10:53
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        LinkedBlockingDeque<PCData> blockingDeque = new LinkedBlockingDeque<>(10);
        Producer producer1 = new Producer(blockingDeque);
        Producer producer2 = new Producer(blockingDeque);
        Producer producer3 = new Producer(blockingDeque);
        Consumer consumer1 = new Consumer(blockingDeque);
        Consumer consumer2 = new Consumer(blockingDeque);
        Consumer consumer3 = new Consumer(blockingDeque);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(producer1);
        service.execute(producer2);
        service.execute(producer3);
        service.execute(consumer1);
        service.execute(consumer2);
        service.execute(consumer3);
        try {
            Thread.sleep(10 * 1000);
            producer1.stop();
            producer2.stop();
            producer3.stop();
            Thread.sleep(3000);
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
