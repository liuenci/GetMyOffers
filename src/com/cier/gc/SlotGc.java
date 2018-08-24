package com.cier.gc;

public class SlotGc {
    public static void main(String[] args) {
        byte[] holder = new byte[32 * 1024 * 1024];
        // 进行垃圾回收
        System.gc();
    }
}
