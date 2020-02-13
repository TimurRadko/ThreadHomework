package com.timurradko.threadHomework;

public class threadHomework2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.setName("Thread1");
        thread2.setName("Thread2");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
}
