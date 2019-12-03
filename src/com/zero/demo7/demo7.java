package com.zero.demo7;

public class demo7 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                Printer printer=new Printer();
                while (true){
                    printer.print1();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                Printer printer=new Printer();
                while (true){
                    printer.print2();
                }
            }
        }.start();
    }
}
