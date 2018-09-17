package com.cier.base.set;

import java.util.HashSet;

public class Demo {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();

        strings.add("1");
        strings.add("2");
        strings.forEach(System.out::println);
    }
}
