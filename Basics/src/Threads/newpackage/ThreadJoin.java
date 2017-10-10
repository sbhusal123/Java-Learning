package Threads.newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadJoin {

    private static   int count = 0;
    
    public static synchronized void Count() {
        count++;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    Count();
                }
            }

        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    Count();
                }
            }

        });

        t1.start();

        t2.start();

        System.out.println(count);
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
