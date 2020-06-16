package com.qs.jvm.ObjectDemo;

class MyNum {
   volatile int num = 10;
    public void getNum(){
        this.num = 20;
    }
}

class T2{
    public static void main(String[] args) {
        MyNum number = new MyNum();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    number.getNum();
                    System.out.println(Thread.currentThread().getName()+"\t update number"+number.num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while (number.num == 10){

        }
        System.out.println(Thread.currentThread().getName()+"mission is over"+number.num);
    }
}
