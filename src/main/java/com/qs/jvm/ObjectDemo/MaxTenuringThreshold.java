package com.qs.jvm.ObjectDemo;

import java.lang.management.RuntimeMXBean;

public class MaxTenuringThreshold {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("MAX_MEMORY"+maxMemory+"字节:"+(maxMemory/(double)1024/1024));
        System.out.println("MAX_MEMORY"+totalMemory+"字节:"+(totalMemory/(double)1024/1024));

    }
}
