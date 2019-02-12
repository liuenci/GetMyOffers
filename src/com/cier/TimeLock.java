package com.cier;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// 限时等待锁
public class TimeLock implements Runnable{


    public static ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        try {
            if (reentrantLock.tryLock(5, TimeUnit.SECONDS)) {
                Thread.sleep(6000);
            }else {
                System.out.println("get lock failed");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (reentrantLock.isHeldByCurrentThread()) {
                reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TimeLock tl = new TimeLock();
        Thread t1 = new Thread(tl);
        Thread t2 = new Thread(tl);
        t1.start();
        t2.start();
    }
}
