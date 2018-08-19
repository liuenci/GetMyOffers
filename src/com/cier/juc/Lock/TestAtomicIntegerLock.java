package com.cier.juc.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestAtomicIntegerLock {

    private static int synValue;

    public static void main(String[] args) {
        int threadNum = 10;
        int maxValue = 1000000;
        testSync(threadNum, maxValue);
        testLocck(threadNum, maxValue);
    }
    //test synchronized
    public static void testSync(int threadNum, int maxValue) {
        Thread[] t = new Thread[threadNum];
        Long begin = System.nanoTime();
        for (int i = 0; i < threadNum; i++) {
            Lock locks = new ReentrantLock();
            synValue = 0;
            t[i] = new Thread(() -> {

                for (int j = 0; j < maxValue; j++) {
                    locks.lock();
                    try {
                        synValue++;
                    } finally {
                        locks.unlock();
                    }
                }

            });
        }
        for (int i = 0; i < threadNum; i++) {
            t[i].start();
        }
        //main线程等待前面开启的所有线程结束
        for (int i = 0; i < threadNum; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("使用lock所花费的时间为：" + (System.nanoTime() - begin));
    }
    // test Lock
    public static void testLocck(int threadNum, int maxValue) {
        int[] lock = new int[0];
        Long begin = System.nanoTime();
        Thread[] t = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            synValue = 0;
            t[i] = new Thread(() -> {
                for (int j = 0; j < maxValue; j++) {
                    synchronized(lock) {
                        ++synValue;
                    }
                }
            });
        }
        for (int i = 0; i < threadNum; i++) {
            t[i].start();
        }
        //main线程等待前面开启的所有线程结束
        for (int i = 0; i < threadNum; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("使用synchronized所花费的时间为：" + (System.nanoTime() - begin));
    }

}

