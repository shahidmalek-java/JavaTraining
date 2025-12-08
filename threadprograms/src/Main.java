
//class Demothrad extends Thread{
//
//    public Demothrad()
//    {
//        System.out.println("Thread : "+Thread.currentThread().getName()+" State : New");
//    }
//
//    @Override
//    public void start() {
//        System.out.println(Thread.currentThread().getName() + " State : Runnable");
//        super.start();
//    }
//}


//class Demothrad extends Thread{
//
//    public Demothrad()
//    {
//        System.out.println("Thread : "+Thread.currentThread().getName()+" State : New");
//    }
//
//    @Override
//    public void start() {
//        System.out.println(Thread.currentThread().getName() + " State : Runnable");
//        super.start();
//    }
//
//    @Override
//    public void run() {
//        for(int i = 1; i<=5 ;i++)
//        {
//            System.out.println(Thread.currentThread().getName()+ " - "+ i);
//            try {
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e)
//            {
//                System.out.println(e.getMessage());
//            }
//
//            System.out.println(Thread.currentThread().getName()+" State : Time Waiting...");
//        }
//    }
//}




//class Demothrad extends Thread{
//
//    public Demothrad()
//    {
//        System.out.println("Thread : "+Thread.currentThread().getName()+" State : New");
//    }
//
//    @Override
//    public void start() {
//        System.out.println(Thread.currentThread().getName() + " State : Runnable");
//        super.start();
//    }
//
//    @Override
//    public void run() {
//        for(int i = 1; i<=5 ;i++)
//        {
//            System.out.println(Thread.currentThread().getName()+" Thread "+ i);
//            Thread.yield();
//
//        }
//    }
//}



//class MyClass {
//
//    // Only one thread can enter this method at a time
//    synchronized void myMethod() {
//        System.out.println(Thread.currentThread().getName() + " got inside the method");
//
//        try {
//            Thread.sleep(3000); // Hold the lock for 3 seconds
//        } catch (Exception e) {}
//
//        System.out.println(Thread.currentThread().getName() + " is coming out of the method");
//    }
//}



//class MyClass {
//
//    synchronized void waitingMethod() {
//        System.out.println(Thread.currentThread().getName() + " is going to wait...");
//
//        try {
//            wait();  // Thread goes into WAITING state
//        } catch (Exception e) {}
//
//        System.out.println(Thread.currentThread().getName() + " got notified and resumed work");
//    }
//
//    synchronized void notifyingMethod() {
//        System.out.println(Thread.currentThread().getName() + " is going to notify...");
//        notify();  // Wakes up one waiting thread
//        System.out.println(Thread.currentThread().getName() + " finished notifying");
//    }
//}



//class MyThread extends Thread {
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + " is running...");
//        try {
//            Thread.sleep(3000);  // Just to keep the thread busy
//        } catch (Exception e) {}
//        System.out.println(Thread.currentThread().getName() + " finished running");
//    }
//}



//class MyThread extends Thread {
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + " is running...");
//        try {
//            Thread.sleep(3000);  // Just to keep the thread busy
//        } catch (Exception e) {}
//        System.out.println(Thread.currentThread().getName() + " finished running");
//    }
//}



//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is Running...");
//    }
//}


import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is Running...");
//    }
//}


//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is Running...");
//    }
//}



//class MyThread implements Runnable{
//
//    public void run()
//    {
//        System.out.println(Thread.currentThread().getName()+" is Running Created Using Interface ::");
//    }
//
//}




//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        for (int i=1; i<4 ; i++)
//        {
//            System.out.println("Thread : "+Thread.currentThread().getName()+" --> "+i);
//        }
//    }
//}



//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        for (int i=1; i<4 ; i++)
//        {
//            System.out.println("Thread : "+Thread.currentThread().getName()+" --> "+i);
//        }
//    }
//}



//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" Priority is : "+Thread.currentThread().getPriority());
//    }
//}




//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is Running...Priority is : "+Thread.currentThread().getPriority());
//    }
//}



//class DemoThread extends Thread{
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is Running...");
//        System.out.println("Priority : "+Thread.currentThread().getPriority());
//        System.out.println("State : "+Thread.currentThread().getState());
//    }
//}



//class DemoThread extends Thread{
//    private String tname;
//    public DemoThread(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is Running...");
//    }
//}





public class Main {
    public static void main(String[] args) {


//        Demothrad d1 = new Demothrad();
//        d1.start();
//        System.out.println(Thread.currentThread().getName()+ "State : Terminated");



//        Demothrad d1 = new Demothrad();
//        d1.start();
//        System.out.println(Thread.currentThread().getName()+ "State : Terminated");


//        Demothrad d1 = new Demothrad();
//        d1.start();
//        System.out.println("Thread : "+Thread.currentThread().getName()+" State : Terminated");
//
//        Demothrad d2 = new Demothrad();
//        d2.start();
//        System.out.println("Thread : "+Thread.currentThread().getName()+" State : Terminated");



//        MyClass obj = new MyClass();
//
//        Thread t1 = new Thread(() -> obj.myMethod(), "Thread-1");
//        Thread t2 = new Thread(() -> obj.myMethod(), "Thread-2");
//        t1.start();
//        try { Thread.sleep(100); } catch (Exception e) {}
//        t2.start();



//        MyClass obj = new MyClass();
//
//        // Thread that will wait
//        Thread t1 = new Thread(() -> obj.waitingMethod(), "Thread-1");
//
//        // Thread that will notify
//        Thread t2 = new Thread(() -> obj.notifyingMethod(), "Thread-2");
//
//        t1.start();
//
//        // Small delay so Thread-1 definitely starts waiting first
//        try { Thread.sleep(1000); } catch (Exception e) {}
//
//        t2.start();



//        MyThread t1 = new MyThread();
//        t1.setName("Child-Thread");
//
//        t1.start();
//
//        System.out.println("Main thread will now wait for 2 seconds using join(2000)...");
//
//        try {
//            t1.join(2000);  // MAIN THREAD goes into TIMED_WAITING
//        } catch (Exception e) {}
//
//        System.out.println("Main thread resumed after timed waiting");



//        MyThread m1 = new MyThread();
//        m1.start();


//        MyThread m1 = new MyThread();
//        Thread t1 = new Thread(m1);
//        t1.start();


//        DemoThread d1 = new DemoThread("Worker Thread - 1");
//        d1.start();


//        DemoThread d1 = new DemoThread("Worker Thread - 1");
//        d1.start();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter New name for Thread : ");
//        String str = sc.nextLine();
//        d1 = new DemoThread(str);
//        d1.start();


//        DemoThread d1 = new DemoThread("Main-1");
//        d1.start();


//        DemoThread d1 = new DemoThread("Demo_1");
//        DemoThread d2 = new DemoThread("Demo_2");
//        DemoThread d3 = new DemoThread("Demo_3");
//        DemoThread d4 = new DemoThread("Demo_4");
//        DemoThread d5 = new DemoThread("Demo_5");
//        d1.start();
//        d2.start();
//        d3.start();
//        d4.start();
//        d5.start();



//        DemoThread d1 = new DemoThread("Demo" );
//        DemoThread d2 = new DemoThread("Demo_2");
//        DemoThread d3 = new DemoThread("Demo_3");
//        DemoThread d4 = new DemoThread("Demo_4");
//        d1.start();
//        d2.start();
//        d3.start();
//        d4.start();
//        try {
//            d1.join(2000);
//            d2.join(3000);
//            d3.join(4000);
//            d4.join(5000);
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        
        
//        DemoThread d1 = new DemoThread("Shahid ");
//        d1.start();



//        DemoThread d1 =new DemoThread("Demo1");
//        DemoThread d2 =new DemoThread("Demo2");
//        DemoThread d3 =new DemoThread("Demo3");
//        d1.setPriority(Thread.MAX_PRIORITY);
//        d2.setPriority(Thread.MIN_PRIORITY);
//
//        d2.start();
//        d3.start();
//        d1.start();


//        DemoThread d1 = new DemoThread();
//        d1.start();



//        DemoThread d1 =new DemoThread("main");
//        d1.start();
//        d1 = new DemoThread("Primary Thread");
//        d1.start();

//
//        ThreadGroup tg = new ThreadGroup("Workers");
//
//        Thread t1 = new Thread(tg,() ->{
//            System.out.println("Thread -1 is Running in Thread Group..."+Thread.currentThread().getThreadGroup().getName());
//        });
//
//        Thread t2 = new Thread(tg,() ->{
//            System.out.println("Thread Group : "+Thread.currentThread().getThreadGroup().getName()+" Tread : "+Thread.currentThread().getName());
//        });
//        Thread t3 = new Thread(tg,() ->{
//            System.out.println("Thread Group : "+Thread.currentThread().getThreadGroup().getName()+" Tread : "+Thread.currentThread().getName());
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();



//        ThreadGroup g2 = new ThreadGroup("Students");
//
//        Thread g2t1 = new Thread(g2,()->{
//            System.out.println(Thread.currentThread().getThreadGroup().getName()+" Thread : "+Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
//
//        });
//
//        Thread g2t2 = new Thread(g2,()->{
//            System.out.println(Thread.currentThread().getThreadGroup().getName()+" Thread : "+Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
//
//        });
//
//        g2t1.start();
//        g2t2.start();



        ThreadGroup group = new ThreadGroup("Workers");

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("Thread: " + Thread.currentThread().getName() +
                                " | Group: " + Thread.currentThread().getThreadGroup().getName());
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted!");
                }
            }
        };
        Thread t1 = new Thread(group, task, "Worker-1");
        Thread t2 = new Thread(group, task, "Worker-2");

        t1.start();
        t2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(">>> Interrupting all threads in the group...");
        group.interrupt();

    }
}