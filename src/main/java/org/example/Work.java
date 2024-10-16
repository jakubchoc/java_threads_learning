package org.example;

public class Work {

    private boolean hotovo = false;

    public synchronized void waitForEnd() throws InterruptedException {
        while (!hotovo) {
            wait();  // Čeká, dokud není práce hotová
        }
        System.out.println("Práce dokončena!");
    }

    public synchronized void done() {
        hotovo = true;
        notify();  // Oznámí čekajícím vláknům
    }
}
