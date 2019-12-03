package com.zero.demo7;

public class Printer {

    public void print1(){
        synchronized (Printer.class){
            System.out.println("流");
            System.out.println("光");
            System.out.println("溢");
            System.out.println("彩");
        }
    }
    public void print2(){
        synchronized (Printer.class){
            System.out.println("君");
            System.out.println("临");
            System.out.println("天");
            System.out.println("下");
        }
    }
}
