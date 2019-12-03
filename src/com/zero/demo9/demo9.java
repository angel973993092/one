package com.zero.demo9;

public class demo9 {
    public static void main(String[] args) {

    }
}
class SellTick2 implements Runnable{
    int tickets=100;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (tickets<0){
                    break;
                }
                String name=Thread.currentThread().getName();
                System.out.println(name+"卖了第"+tickets+"张票!");
                tickets--;
            }
        }
    }
}
