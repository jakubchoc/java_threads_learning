package org.example;

public class Deadlock {

    synchronized void metodaA(Deadlock druhy) {
        System.out.println(Thread.currentThread().getName() + " získal zámek na objektu 1 a čeká na objekt 2.");
        try {
            Thread.sleep(100); }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        druhy.metodaB(this);  // Čeká na zámek druhého objektu.
    }

    synchronized void metodaB(Deadlock prvni) {
        System.out.println(Thread.currentThread().getName() + " získal zámek na objektu 2 a čeká na objekt 1.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        prvni.metodaA(this);  // Čeká na zámek prvního objektu.
    }
}
