package com.cier.base.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap();
        for (int i = 0; i < 5; i++) {
            hashMap.put("key-" + i, "value-" + i);
        }
        // 使用 Entry
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("========================");
        // 遍历 keys 或 values
        for (String key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }
        // 使用迭代器
        System.out.println("========================");
        Iterator<Map.Entry<String, String>> entryIterator = hashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // 使用 lambda
        System.out.println("========================");
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("========================");
        hashMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
            if ("key-1".equals(k)) {
                System.out.println("hello" + " " + k);
            }
        });
    }
}
