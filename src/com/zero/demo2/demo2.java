package com.zero.demo2;

public class demo2 {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr);
        t.start();
        Thread t1=new Thread(mr);
        t1.start();
    }
}
class MyRunnable implements Runnable{
    int num=1;
    @Override
    public void run() {
      while (true){
          if (num>20){
              break;
          }
          System.out.println(num++);
      }
    }
}
