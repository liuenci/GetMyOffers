package com.cier;

import java.util.Vector;

public class VectorTask {
    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        while (true){
            for (int i = 0; i < 10; i++){
                vector.add(i);
            }

            Thread removeThread = new Thread(new Runnable() {
                @Override
                public synchronized void run() {
                    for (int i = 0; i < vector.size(); i++){
                        vector.remove(i);
                    }
                }
            });

            Thread printThread = new Thread(new Runnable() {
                @Override
                public synchronized void run() {
                    for (int i = 0; i < vector.size(); i++){
                        System.out.print(vector.get(i));
                    }
                }
            });

            removeThread.start();
            printThread.start();

            // 不要产生过多的线程，否则会导致操作系统假死
            while (Thread.activeCount() > 20);
        }
    }
}
