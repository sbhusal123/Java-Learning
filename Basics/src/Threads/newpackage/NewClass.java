package Threads.newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyClass extends Thread {

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread id:"+ Thread.currentThread().getId()+ " Content: "+i);
        }
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

public class NewClass {

    public static void main(String[] args) {
        MyClass thread = new MyClass();
        thread.start();
        
        MyClass thread1 = new MyClass();
        
        thread1.start();
    }

}
