package com.zero.demo8;

public class fun1 {
    public static void main(String[] args) {
        new SellTicket().start();
        new SellTicket().start();
        new SellTicket().start();

    }
}
class SellTicket extends Thread{
    private  static int tickets=100;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SellTicket.class){
                if (tickets<=0){
                    break;
                }
                System.out.println(getName()+"卖了第"+tickets+"张票");
                tickets--;
            }
        }
    }
}
