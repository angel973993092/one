package com.zero.dem01;

public class demo1 {
    public static void main(String[] args) {
       MyThread mt=new MyThread();
       mt.start();
       MyThread mt1=new MyThread();
       mt1.start();
    }
}
class MyThread extends Thread{
    static int num=1;

    @Override
    public void run() {
        while (true){
            if (num>30){
                break;
            }
            System.out.println(num++);
        }
    }
}
