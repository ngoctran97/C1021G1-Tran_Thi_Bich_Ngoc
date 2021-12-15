package ss11_DSA_Stack_Queue.Exercise.Reverse.Queue;

public class Queue {
    Node front, rear;
    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else
            q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }
    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Hàng đợi rỗng !!");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }
    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Phần tử trong liên kết vòng là : ");
        while (temp.link != q.front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.front = q.rear = null;
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);
        displayQueue(q);
        System.out.println("Deleted value :" + deQueue(q));
        System.out.println("Deleted value :" + deQueue(q));
        displayQueue(q);
        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }
}
