package Leetcode;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: KlayHu
 * @create: 2020/9/2 16:13
 **/
public class StopThread {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {

        Thread backgroundThread = new Thread(new Runnable() {

            public void run() {
                // TODO Auto-generated method stub
                int count=0;
                while(!stopRequested) {
                    count++;
                    System.out.println(count);
                }
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}