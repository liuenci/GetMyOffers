package com.cier.base.yunsuan;

public class Demo2 {
    public static void main(String[] args) {
        byte b1 = 1, b2 = 2, b3, b6, b8;
        final byte b4 = 4, b5 = 6, b7;
        b3 = (byte) (b1 + b2);
        b6 = b4 + b5;    /*语句2*/
        b8 = (byte) (b1 + b4);  /*语句3*/
        b7 = (byte) (b2 + b5);  /*语句4*/
        System.out.println(b3 + b6);
    }
}
