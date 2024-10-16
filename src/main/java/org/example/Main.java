package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //THREAD

        /*Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " běží.");
        };

        Thread t1 = new Thread(task, "Vlákno-1");
        Thread t2 = new Thread(task, "Vlákno-2");
        Thread t3 = new Thread(task, "Vlákno-3");

        //THREAD

        t1.start();
        t2.start();
        t3.start();

        //RUNNABLE

        MyThread thread = new MyThread();
        thread.start();*/

        //COUNTER

        /*Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();  // Čeká na dokončení vlákna t1
        t2.join();  // Čeká na dokončení vlákna t2

        System.out.println("Výsledek: " + counter.getCount());*/

        //WAIT NOTIFY

        /*Work prace = new Work();

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Prvni vlakno zacalo");
                System.out.println("Prvni vlakno ceka na dokonceni");
                prace.waitForEnd();
                System.out.println("Prvni vlakno dokoncilo praci");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Druhe vlakno zacalo a pracuje ");
                Thread.sleep(1000);
                System.out.println("Druhe vlakno dokoncilo praci a oznamuje ");
                prace.done();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();*/

        //EXECUTOR SERVICE (THREAD POOL)

        /*ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> System.out.println("Úloha 1");
        Runnable task2 = () -> System.out.println("Úloha 2");

        executor.execute(task1);
        executor.execute(task2);

        executor.shutdown();  // Uvolní vlákna*/

        //DEADLOCK

        /*Deadlock deadlock1 = new Deadlock();
        Deadlock deadlock2 = new Deadlock();

        // První vlákno pracuje se zdroj1 -> zdroj2
        Thread t1 = new Thread(() -> deadlock1.metodaA(deadlock2), "Vlákno-1");

        // Druhé vlákno pracuje se zdroj2 -> zdroj1
        Thread t2 = new Thread(() -> deadlock1.metodaB(deadlock2), "Vlákno-2");

        t1.start();
        t2.start();*/

    }
}