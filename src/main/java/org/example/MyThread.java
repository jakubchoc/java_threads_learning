package org.example;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("vlakno zase jede: " + this.getName());
    }
}
