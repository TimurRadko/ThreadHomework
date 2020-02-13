package com.timurradko.threadHomework;

public class ThreadHomework2 extends Thread {

    ThreadHomework2(String name) {
        setName(name);
        start();
    }

    public static void main(String[] args) {
        ThreadHomework2 thread1 = new ThreadHomework2("Thread1");
        ThreadHomework2 thread2 = new ThreadHomework2("Thread2");
//        for (int i = 0; i < 5; i++) {
//            try {
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//            }
//        }


        //System.out.println(Thread.currentThread());
        System.out.println(thread2.isAlive());
        System.out.println(thread1.isAlive());

    }
}
