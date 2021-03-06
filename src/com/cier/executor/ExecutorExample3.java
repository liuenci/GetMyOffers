package com.cier.executor;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 可缓冲线程池
 * 创建一个定长线程池，支持定时及周期性任务执行
 * ScheduledExecutorService比Timer更安全，功能更强大
 */
public class ExecutorExample3 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        /*scheduledThreadPool.schedule(()->{
            System.out.println("延迟 " + 1 + " 秒");
        },1, TimeUnit.SECONDS);*/
        scheduledThreadPool.scheduleAtFixedRate(()->{
            System.out.println("延迟 1 秒之后每隔 2 秒执行");
        },1,2,TimeUnit.SECONDS);
    }
}
