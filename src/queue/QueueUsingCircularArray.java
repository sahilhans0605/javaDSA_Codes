package queue;

public class QueueUsingCircularArray {
    int front, rear;
    int a[];
    int n;

    public QueueUsingCircularArray(int n) {
        front = rear = -1;
        a = new int[n];
        this.n = n;
    }

    void enqueue(int data) throws Exception {
        if (isFull()) throw new Exception("Queue Array is full");
        if (front == -1 || rear == -1) {
            front = 0;
        }
        rear = (rear + 1) % n;
        a[rear] = data;
    }

    int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");
        int ans = a[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % n;
        }
        return ans;
    }

    boolean isFull() {
        return (rear + 1) % n == front;
    }

    boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    int peek() throws Exception {
        if(isEmpty())throw new Exception("Array is empty");
        return a[front];
    }
    public static void main(String[]args) throws Exception {
        QueueUsingCircularArray queueUsingCircularArray =new QueueUsingCircularArray(5);
        queueUsingCircularArray.enqueue(1);
        queueUsingCircularArray.enqueue(2);
        queueUsingCircularArray.enqueue(3);
        queueUsingCircularArray.enqueue(4);
        queueUsingCircularArray.enqueue(5);
        System.out.println(queueUsingCircularArray.dequeue());
        queueUsingCircularArray.enqueue(6);
        System.out.println(queueUsingCircularArray.dequeue());
        queueUsingCircularArray.enqueue(7);

        while(!queueUsingCircularArray.isEmpty()){
            System.out.println(queueUsingCircularArray.dequeue());

        }

    }
}
