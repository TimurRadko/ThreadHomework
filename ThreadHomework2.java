package com.timurradko.threadHomework;

public class ThreadHomework2 extends Thread {

    ThreadHomework2(String name) {
        setName(name);
        start();
    }

    public static void main(String[] args) {
        ThreadHomework2 thread1 = new ThreadHomework2("Thread1");
        ThreadHomework2 thread2 = new ThreadHomework2("Thread2");
        System.out.println(Thread.currentThread().getName());


        //System.out.println(Thread.currentThread());
        //System.out.println(thread1.getName());
        //System.out.println(thread2.getName());
    }
}
