import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Que3 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);



            Thread producer = new Thread(()-> {
                try {
                    for (int i = 1; i <= 5; i++) {
                         queue.put(i);
                        System.out.println("Produce : "+i);
                    }
                }catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            });

            Thread consumer = new Thread(()->{
                try {
                    for (int i = 1;i<= 5 ; i++)
                    {
                        int val = queue.take();
                        System.out.println("Consumed : "+i);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            producer.start();
            consumer.start();

    }
}
