package com.cier.time;

public class Demo1 {
    int foo(int[] array,int n,int key){
        int n1 = 0,n2 = n -1,m;
        while (n1 < n2){
            m = (n1 + n2)/2;
            if (array[m] == key){
                n2 = m - 1;
            }else{
                n1 = m + 1;
            }
        }
        return -1;
    }
}
