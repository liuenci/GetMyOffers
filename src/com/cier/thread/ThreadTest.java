package com.cier.thread;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLock(true));
        Thread t2 = new Thread(new DeadLock(false));
        t1.start();
        t2.start();
    }
}
class DeadLock implements Runnable{
    boolean lockFormer;
    static Object o1 = new Object();
    static Object o2 = new Object();

    DeadLock(boolean lockFormer){
        this.lockFormer = lockFormer;
    }
    @Override
    public void run() {
        if (this.lockFormer){
            synchronized (o1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("1ok");
                }
            }
        }else {
            synchronized (o2){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("2ok");
                }
            }
        }
    }
}
