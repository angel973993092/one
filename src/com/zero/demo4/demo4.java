package com.zero.demo4;

public class demo4 {
    public static void main(String[] args) {
        //匿名对象开启runnable
       MyRunnable mr=new MyRunnable();
       new Thread(mr).start();
       new Thread(mr).start();
       new Thread(mr).start();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
