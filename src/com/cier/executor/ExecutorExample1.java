package com.cier.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 可缓冲线程池
 * 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
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
