import java.io.IOException;
import java.util.InputMismatchException;
import java.util.concurrent.locks.ReentrantLock;

//class Counter{
//    int count = 0;
//    public void increment(){
//        synchronized (this){
//            count++;
//            System.out.println(Thread.currentThread().getName()+" Increment Count ");
//        }
//    }
//}
//
//
//class Counter{
//   static int count = 0;
//    public static synchronized void increment(){
//            count++;
//            System.out.println(Thread.currentThread().getName()+" Increment Count ");
//
//    }
//}
//
//
//
//class Data {
//    private int value;
//    private boolean available = false; // true if producer has produced, false if consumed
//
//    // Producer produces
//    public synchronized void produce(int val) throws InterruptedException {
//        while (available) {  // wait if data not yet consumed
//            wait();
//        }
//        value = val;
//        System.out.println("Produced: " + value);
//        available = true;   // mark as produced
//        notify();           // notify consumer
//    }
//
//    // Consumer consumes
//    public synchronized void consume() throws InterruptedException {
//        while (!available) { // wait if no data produced
//            wait();
//        }
//        System.out.println("Consumed: " + value);
//        available = false;  // mark as consumed
//        notify();           // notify producer
//    }
//}
//
//
//
//
//class Printer {
//    private int number = 1; // start number
//    private final int MAX = 20;
//
//    public synchronized void printOdd() throws InterruptedException {
//        while (number <= MAX) {
//            if (number % 2 == 0) { // wait if it's even
//                wait();
//            } else {
//                System.out.println("Odd: " + number);
//                number++;
//                notify(); // wake even thread
//            }
//        }
//    }
//
//    public synchronized void printEven() throws InterruptedException {
//        while (number <= MAX) {
//            if (number % 2 != 0) { // wait if it's odd
//                wait();
//            } else {
//                System.out.println("Even: " + number);
//                number++;
//                notify(); // wake odd thread
//            }
//        }
//    }
//}
//
//
//
//
//
//class BoundedBufferArray {
//
//    private final int MAX = 5;
//    private final int[] buffer = new int[MAX];
//
//    private int in = 0;      // next insertion index
//    private int out = 0;     // next removal index
//    private int count = 0;   // number of items in buffer
//
//    public synchronized void produce(int value) throws InterruptedException {
//
//        while (count == MAX) {
//            System.out.println("Buffer full → Producer waiting...");
//            wait();
//        }
//
//        buffer[in] = value;
//        in = (in + 1) % MAX;
//        count++;
//
//        System.out.println("Produced: " + value + " | Buffer count = " + count);
//
//        notifyAll(); // wake up consumers
//    }
//
//    public synchronized void consume() throws InterruptedException {
//
//        while (count == 0) {
//            System.out.println("Buffer empty → Consumer waiting...");
//            wait();
//        }
//
//        int value = buffer[out];
//        out = (out + 1) % MAX;
//        count--;
//
//        System.out.println("Consumed: " + value + " | Buffer count = " + count);
//
//        notifyAll(); // wake up producers
//    }
//}
//
//
//
//


public class Main {

//    private static int data = 0;
//
//    static class Spoon {
//        private Diner owner;
//
//        public Spoon(Diner d) {
//            owner = d;
//        }
//
//        public Diner getOwner() {
//            return owner;
//        }
//
//        public synchronized void setOwner(Diner d) {
//            owner = d;
//        }
//
//        public synchronized void use() {
//            System.out.println(owner.getName() + " is eating...");
//        }
//    }
//
//    static class Diner {
//        private String name;
//        private boolean hungry = true;
//
//        public Diner(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public boolean isHungry() {
//            return hungry;
//        }
//
//        public void eatWith(Spoon spoon, Diner spouse) {
//            while (hungry) {
//                // If the other diner is hungry, give them the spoon
//                if (spouse.isHungry()) {
//                    System.out.println(name + ": You go ahead, " + spouse.getName());
//                    spoon.setOwner(spouse);
//
//                    try {
//                        Thread.sleep(100); // back off and let the other try
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    continue;
//                }
//
//                // Otherwise, use the spoon
//                synchronized (spoon) {
//                    spoon.use();
//                    hungry = false;
//                    System.out.println(name + " has finished eating.");
//                    spoon.setOwner(spouse);
//                }
//            }
//        }
//    }
//
//
//    static class Resource {
//        String name;
//        Resource(String name) { this.name = name; }
//    }
//
//    static Resource L1 = new Resource("L1");
//    static Resource L2 = new Resource("L2");
//
//     Two locks shared by threads
//    static ReentrantLock lockA = new ReentrantLock();
//    static ReentrantLock lockB = new ReentrantLock();
//
//    // Work method using tryLock() to avoid deadlock
//    public static void doWork(ReentrantLock first, ReentrantLock second) {
//
//        while (true) {
//
//            // Try to take the first lock
//            if (first.tryLock()) {
//                try {
//                    // Try to take the second lock
//                    if (second.tryLock()) {
//                        try {
//                            System.out.println(Thread.currentThread().getName()
//                                    + " acquired both locks. No deadlock!");
//                            break; // Both locks acquired → exit loop
//                        } finally {
//                            second.unlock();
//                        }
//                    } else {
//                        System.out.println("Could not acquire lock, retrying...");
//                    }
//                } finally {
//                    first.unlock();
//                }
//            } else {
//                System.out.println("Could not acquire lock, retrying...");
//            }
//
//            // Small pause before trying again
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//            }
//        }
//    }


    public static void main(String[] args) {


//      Counter c1 = new Counter();
//      Counter c2 = new Counter();
//      Counter c3 = new Counter();
//
//      Thread t1 = new Thread(()->{
//          for (int i = 0 ; i<4 ;i++)
//          {
//              c1.increment();
//
//          }
//      },"Thread-1");
//
//        Thread t2 = new Thread(()->{
//            for (int i = 0 ; i<4 ;i++)
//            {
//                c1.increment();
//            }
//        },"Thread-2 ");
//
//        t1.start();
//        t2.start();
//
//
//
//        Thread t1 = new Thread(()->{
//            for (int i = 0 ; i<4 ;i++)
//            {
//                c1.increment();
//
//            }
//        },"Thread-1");
//
//        Thread t2 = new Thread(()->{
//            for (int i = 0 ; i<4 ;i++)
//            {
//                c2.increment();
//            }
//        },"Thread-2 ");
//
//        Thread t3 = new Thread(()->{
//            for (int i = 0 ; i<4 ;i++)
//            {
//                c3.increment();
//            }
//        },"Thread-3 ");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//
//        Data data = new Data();
//
//        Thread producer = new Thread(() -> {
//            int val = 0;
//            try {
//                while (true) {
//                    data.produce(val++);
//                    Thread.sleep(500); // simulate work
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread consumer = new Thread(() -> {
//            try {
//               for (int i = 0; i < 10 ; i++){
//
//                    data.consume();
//                    Thread.sleep(500); // simulate work
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        producer.start();
//        consumer.start();
//
//
//
//        Printer printer = new Printer();
//
//        Thread oddThread = new Thread(() -> {
//            try {
//                printer.printOdd();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread evenThread = new Thread(() -> {
//            try {
//                printer.printEven();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        oddThread.start();
//        evenThread.start();
//
//
//
//         Thread A
//        Thread threadA = new Thread(() -> {
//            synchronized (L1) {
//                System.out.println("Thread A locked L1");
//
//                try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//                synchronized (L2) {
//                    System.out.println("Thread A locked L2");
//                }
//            }
//        }, "Thread-A");
//
//        // Thread B
//        Thread threadB = new Thread(() -> {
//            synchronized (L2) {
//                System.out.println("Thread B locked L2");
//
//                try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//                synchronized (L1) {
//                    System.out.println("Thread B locked L1");
//                }
//            }
//        }, "Thread-B");
//
//        threadA.start();
//        threadB.start();
//
//
//
//
//        Thread sleeper = new Thread(() -> {
//            try {
//                System.out.println("Thread going to sleep for 5 seconds...");
//                Thread.sleep(5000);  // Sleep for 5 seconds
//                System.out.println("Thread woke up naturally.");
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted during sleep");
//            }
//        });
//
//        sleeper.start();
//
//        try {
//            Thread.sleep(2000); // Main thread sleeps 2 seconds before interrupting
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        sleeper.interrupt(); // Interrupt the sleeping thread
//
//
//
//
//        Thread t = new Thread(() -> {
//            while (true) {
//                if (Thread.currentThread().isInterrupted()) {
//                    System.out.println("Interrupted flag detected");
//                    break; // Exit loop
//                }
//            }
//        });
//
//        t.start();
//
//        try {
//            Thread.sleep(2000); // Let the thread run for 2 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        t.interrupt(); // Interrupt the thread
//
//
//
//        Thread t1 = new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+" is Currently in State : "+ Thread.currentThread().getState());
//            for (int i = 0; i<4 ; i++)
//            {
//                System.out.println(Thread.currentThread().getName()+" - "+i);
//            }
//        },"Thread-1");
//        Thread t2 = new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+" is Currently in State : "+ Thread.currentThread().getState());
//            for (int i = 0; i<4 ; i++)
//            {
//                System.out.println(Thread.currentThread().getName()+" - "+i);
//            }
//        },"Thread-2");
//
//        Thread t3 = new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+" is Currently in State : "+ Thread.currentThread().getState());
//            for (int i = 0; i<4 ; i++)
//            {
//                System.out.println(Thread.currentThread().getName()+" - "+i);
//            }
//        },"Thread-3");
//
//        t1.start();
//            try {
//                t1.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        t2.start();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        t3.start();
//        try {
//            t3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//
//
//        Thread t1 = new Thread(()-> {
//            for (int i = 0; i < 4 ; i++)
//            {
//                System.out.println("Thread : "+Thread.currentThread().getName()+" --> "+i);
//                Thread.yield();
//            }
//        },"Thread_1");
//
//        Thread t2 = new Thread(()-> {
//            for (int i = 0; i < 4 ; i++)
//            {
//                System.out.println("Thread : "+Thread.currentThread().getName()+" --> "+i);
//                Thread.yield();
//            }
//        },"Thread_2");
//
//        Thread t3 = new Thread(()-> {
//            for (int i = 0; i < 4 ; i++)
//            {
//                System.out.println("Thread : "+Thread.currentThread().getName()+" --> "+i);
//                Thread.yield();
//            }
//        },"Thread_3");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//
//        class SharedLock {
//        }
//
//
//        SharedLock lock = new SharedLock();
//
//        // Worker Thread 1
//        Thread t1 = new Thread(() -> {
//            synchronized (lock) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + " waiting...");
//                    lock.wait();     // waiting on lock
//                    System.out.println(Thread.currentThread().getName() + " resumed!");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "Worker-1");
//
//        // Worker Thread 2
//        Thread t2 = new Thread(() -> {
//            synchronized (lock) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + " waiting...");
//                    lock.wait();
//                    System.out.println(Thread.currentThread().getName() + " resumed!");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "Worker-2");
//
//        // Worker Thread 3
//        Thread t3 = new Thread(() -> {
//            synchronized (lock) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + " waiting...");
//                    lock.wait();
//                    System.out.println(Thread.currentThread().getName() + " resumed!");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "Worker-3");
//
//        // Start all workers
//        t1.start();
//        t2.start();
//        t3.start();
//
//        // Allow workers to start and wait
//        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
//
//        // Main thread notifies all
//        synchronized (lock) {
//            System.out.println("Main thread calling notifyAll()...");
//            lock.notifyAll();
//        }
//
//
//        BoundedBufferArray buffer = new BoundedBufferArray();
//
//        Thread producer = new Thread(() -> {
//            int value = 1;
//            try {
//                while (true) {
//                    buffer.produce(value++);
//                    Thread.sleep(300);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread consumer = new Thread(() -> {
//            try {
//                while (true) {
//                    buffer.consume();
//                    Thread.sleep(600);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        producer.start();
//        consumer.start();
//
//
//
//
//
//            // Thread 1 tries Lock A then Lock B
//            Thread t1 = new Thread(() -> doWork(lockA, lockB), "Thread-1");
//
//            // Thread 2 tries Lock B then Lock A (opposite order → risk of deadlock)
//            Thread t2 = new Thread(() -> doWork(lockB, lockA), "Thread-2");
//
//            t1.start();
//            t2.start();
//
//
//
//
//        Thread worker = new Thread(() -> {
//
//            try {
//                while (true) {
//
//                    // Check if someone interrupted this thread
//                    if (Thread.currentThread().isInterrupted()) {
//                        System.out.println("Interrupt detected → Cleaning up...");
//                        break;   // exit loop
//                    }
//
//                    // Simulating I/O or long work
//                    System.out.println("Working...");
//                    Thread.sleep(500);  // pretend this is a long I/O operation
//                }
//
//            } catch (InterruptedException e) {
//                // Sleep was interrupted
//                System.out.println("Interrupted during I/O → Cleaning up...");
//            }
//
//            // Final cleanup and safe exit
//            System.out.println("Cleanup done → Thread exiting gracefully.");
//        });
//
//        worker.start();
//
//        // Let the thread work for a while
//        try { Thread.sleep(2000); } catch (InterruptedException e) {}
//
//        // Interrupting thread
//        worker.interrupt();
//
//
//        Diner husband = new Diner("Husband");
//        Diner wife = new Diner("Wife");
//        Spoon spoon = new Spoon(husband);
//
//        new Thread(() -> husband.eatWith(spoon, wife)).start();
//        new Thread(() -> wife.eatWith(spoon, husband)).start();
//
//
//
//
//        Object lock = new Object();
//
//        // Reader Thread
//        Thread reader = new Thread(() -> {
//            synchronized (lock) {
//                System.out.println("Reader is reading data: " + data);
//            }
//        });
//
//        // Writer Thread
//        Thread writer = new Thread(() -> {
//            synchronized (lock) {
//                data++;
//                System.out.println("Writer updates data to: " + data);
//            }
//        });
//
//        reader.start();
//        writer.start();





    }
}