public class Que8 {

    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    private Node top;

    void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
        System.out.println(data + " Pushed");
    }

    int pop()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty...");
            return -1;
        }
        int data = top.data;
        System.out.println(data+ " Poped");
        top = top.next;
        return data;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }

        Node temp = top;
        System.out.println("Stack elements:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Que8 stack = new Que8();
        stack.push(10);
        stack.display();
        stack.push(20);
        stack.display();
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();

    }
}
