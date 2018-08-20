package com.cier.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 可缓冲线程池
 */
public class ExecutorExample1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++){
            final int index = i;
            try {
                Thread.sleep(index * 100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            executorService.execute(()->{
                System.out.println(index);
            });
        }

    }
}
