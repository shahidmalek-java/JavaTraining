public class CircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public CircularQueue(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = -1;
        rear = -1;
        size = 0;
    }

    // check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // check if full
    public boolean isFull() {
        return size == capacity;
    }

    // enqueue (insert at rear)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }

        // first element
        if (front == -1) {
            front = 0;
        }

        // circular increment
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        System.out.println(value + " enqueued");
    }

    // dequeue (remove from front)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        int value = arr[front];

        // circular increment
        front = (front + 1) % capacity;
        size--;

        // if queue becomes empty reset
        if (size == 0) {
            front = rear = -1;
        }

        return value;
    }

    // peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }

    // display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Circular Queue elements:");
        int i = front;

        while (true) {
            System.out.println(arr[i]);
            if (i == rear) break;
            i = (i + 1) % capacity; // wrap-around
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.display();

        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Front: " + cq.peek());

        cq.enqueue(50);
        cq.enqueue(60);   // wrap-around insert

        cq.display();
    }
}