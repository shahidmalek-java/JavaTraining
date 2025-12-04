public class Stack {

    int[] a;
    int top;
    int capacity;

    public Stack(int size) {
        capacity = size;
        a = new int[size];
        top = -1;   // stack is empty
    }

    // push
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        a[++top] = value;
        System.out.println(value + " pushed");
    }

    // pop
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return a[top--];
    }

    // peek
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return a[top];
    }

    // isEmpty
    boolean isEmpty() {
        return top == -1;
    }

    // isFull
    boolean isFull() {
        return top == capacity - 1;
    }

    // print stack
    void print() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());

        s.print();
    }
}