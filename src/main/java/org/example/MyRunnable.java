package org.example;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Vlakno jede: " + Thread.currentThread().getName());
    }
}
