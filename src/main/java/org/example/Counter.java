package org.example;

public class Counter {

    private int count = 0;

    //synchronized zajisti ze nemuzou dve vlakna pristoupit do metody najednou,
    //predtim obe vlakna pristoupili najednou, ale count se pricetl jen jednou.
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
