package com.qs.jvm.ObjectDemo;

public class MyObject {

    static int num = 10;

    {
        num = 11;
    }

    public static void main(String[] args) {

        num = 12;
        System.out.println(num);
    }
}
