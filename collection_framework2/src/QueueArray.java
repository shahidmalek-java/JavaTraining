public class QueueArray {

    int[] arr;
    int front;
    int rear;
    int size;

    public QueueArray(int capacity) {
        arr = new int[capacity];
        front = 0;      // first element index
        rear = -1;      // no elements yet
        size = 0;       // current number of elements
    }

    // enqueue - insert at rear
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        arr[++rear] = value;
        size++;
        System.out.println(value + " enqueued");
    }

    // dequeue - remove from front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int value = arr[front];

        // shift elements to the left
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        size--;

        return value;
    }

    // peek - front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    // display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = 0; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}