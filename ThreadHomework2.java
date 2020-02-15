package com.timurradko.threadHomework;

public class ThreadHomework2 {
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new NamePrintThread("Thread1");
        Thread thread2 = new NamePrintThread("Thread2");
        thread1.start();
        thread2.start();

    }

    static class NamePrintThread extends Thread {
        private NamePrintThread (String name) {
            setName(name);
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + " is running now");
                }
            }
        }
    }
}
