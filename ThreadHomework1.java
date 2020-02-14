package com.timurradko.threadHomework;

public class ThreadHomework1 {

    public static void main(String[] args) {
        Thread thread = new ThreadHome1("Thread");
        System.out.println(thread.getName() + " has not yet started. Thread condition: " + thread.getState());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getName() + " has exited. Thread condition: " + thread.getState());
    }


    static class ThreadHome1 extends Thread {
        private ThreadHome1 (String name) {
            setName(name);
        }

        @Override
        public void run () {
            System.out.println(getName() + " is running. Thread condition: " + getState());
        }
    }
}
