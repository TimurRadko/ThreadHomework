package com.timurradko.threadHomework;

public class ThreadHomework2 extends Thread {

    ThreadHomework2(String name) {
        setName(name);
        start();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread1");
        Thread thread2 = new Thread("Thread2");



        //System.out.println(Thread.currentThread());
        //System.out.println(thread1.getName());
        //System.out.println(thread2.getName());
    }
}
