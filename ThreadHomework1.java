package com.timurradko.threadHomework;

public class ThreadHomework1 extends Thread {

    private ThreadHomework1(String name) {
        setName(name);
    }

    public static void main(String[] args) {
        ThreadHomework1 thread = new ThreadHomework1("Thread");
        System.out.println(thread.getName() + " has not yet started. Thread condition: " + thread.getState());
        thread.start();
        System.out.println(thread.getName() + " is running. Thread condition: " + thread.getState());
        
        try {
            ThreadHomework1.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName() + " has exited. Thread condition:" + thread.getState());
    }
}
