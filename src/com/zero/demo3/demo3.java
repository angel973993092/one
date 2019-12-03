package com.zero.demo3;

public class demo3 {
    public static void main(String[] args) {
        //匿名对象开启thread
        new MyThread().start();
        new MyThread().start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
