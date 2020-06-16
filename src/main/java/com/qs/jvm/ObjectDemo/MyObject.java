package com.qs.jvm.ObjectDemo;

public class MyObject {

    static int num = 10;

    {
        num = 11;
    }

    public static void main(String[] args) {


        System.out.println(num);
    }
}
