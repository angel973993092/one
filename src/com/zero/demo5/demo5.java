package com.zero.demo5;

public class demo5 {
    public static void main(String[] args) {

        //匿名内部类开启thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }.start();
    }

}
