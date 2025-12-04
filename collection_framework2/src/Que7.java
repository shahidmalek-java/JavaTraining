import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Que7 {
    public static void main(String[] args) {

        Queue<Integer> data = new LinkedList<>();
        final int LIMIT = 5;   // queue capacity

        Thread producer = new Thread(() -> {
            int value = 1;
            while (value <= 10) {
                synchronized (data) {

                    while (data.size() == LIMIT) {
                        try {
                            System.out.println("Queue full. Producer waiting...");
                            data.wait(); // producer waits
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    // Produce item
                    data.add(value);
                    System.out.println("Produced : " + value);
                    value++;

                    data.notify(); // wake consumer
                }

                try { Thread.sleep(300); } catch (Exception ignored) {}
            }
        });

        Thread consumer = new Thread(() -> {
            int count = 1;
            while (count <= 10) {
                synchronized (data) {

                    while (data.isEmpty()) {
                        try {
                            System.out.println("Queue empty. Consumer waiting...");
                            data.wait(); // consumer waits
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    // Consume item
                    int item = data.remove();
                    System.out.println("Consumed : " + item);
                    count++;

                    data.notify(); // wake producer
                }

                try { Thread.sleep(500); } catch (Exception ignored) {}
            }
        });

        producer.start();
        consumer.start();


    }
}
