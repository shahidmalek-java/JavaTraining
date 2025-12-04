public class DouEndQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public DouEndQueue(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Insert element at front
    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque is Full!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        arr[front] = value;
        size++;
        System.out.println(value + " inserted at front");
    }

    // Insert at rear
    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque is Full!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = value;
        size++;
        System.out.println(value + " inserted at rear");
    }

    // Delete from front
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty!");
            return -1;
        }

        int value = arr[front];
        front = (front + 1) % capacity;
        size--;

        if (size == 0) front = rear = -1;

        return value;
    }

    // Delete from rear
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty!");
            return -1;
        }

        int value = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;

        if (size == 0) front = rear = -1;

        return value;
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty!");
            return;
        }

        System.out.println("Deque elements:");
        int i = front;
        while (true) {
            System.out.println(arr[i]);
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
    }

    public static void main(String[] args) {
        DouEndQueue deq = new DouEndQueue(5);
        deq.insertRear(10);
        deq.insertFront(50);
        deq.insertRear(100);
        deq.insertFront(5);

        deq.display();

        System.out.println("Delete front: " + deq.deleteFront());
        System.out.println("Delete rear : " + deq.deleteRear());

        deq.display();
    }
}