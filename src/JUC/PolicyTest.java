package JUC;

import java.util.concurrent.*;

/**
 * @description: 线程池拒绝策略
 * @author: KlayHu
 * @create: 2020/9/14 0:10
 **/
public class PolicyTest {

    public static void main(String[] args){
        ThreadFactory factory = r -> new Thread(r,"test-thread-pool");
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(11);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(11,11,0L,
                TimeUnit.SECONDS,queue ,factory,new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 100; ++i) {
            executor.submit(()->{
                try {
                    System.out.println(Thread.currentThread().getName() + "正在运行》》》...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
