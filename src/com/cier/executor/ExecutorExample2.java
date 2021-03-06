package com.cier.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定长线程池
 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 */
public class ExecutorExample2 {
    /**
     * 因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
     * @param args
     */
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
