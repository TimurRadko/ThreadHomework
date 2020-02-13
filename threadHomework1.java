package com.timurradko.threadHomework;

public class threadHomework1 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setName("Thread1");
        System.out.println(thread.getName() + " has not yet started. Thread condition: " + thread.getState());
        thread.start();
        System.out.println(thread.getName() + " is running. Thread condition: " + thread.getState());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName() + " has exited. Thread condition:" + thread.getState());
    }
}
