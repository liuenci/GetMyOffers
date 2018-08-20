package com.cier.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定长线程池
 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 */
public class ExecutorExample2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++){
            final int index = i;
            executorService.execute(()->{
                System.out.println(index);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}
