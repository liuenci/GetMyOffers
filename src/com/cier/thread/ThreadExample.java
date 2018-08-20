package com.cier.thread;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    /**
     * CPU 飙升
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++){
            new ThreadExample().start();
        }
    }
}
