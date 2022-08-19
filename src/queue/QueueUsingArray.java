package queue;

public class QueueUsingArray {

    int front = -1;
    int rear = -1;
    int capacity = 0;
    int a[];

    public QueueUsingArray(int size) {
        a = new int[size];
        this.capacity = size;
    }

    void enqueue(int data) throws Exception {
        if (isFull()) throw new Exception("Queue Array is full");
        rear++;
        a[rear] = data;
    }

    int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue array is empty");
        int ans = a[front];//front is always 0
        for (int i = 0; i < rear; i++) {
            a[i] = a[i + 1];//O(n)
        }
        rear--;
        return ans;
    }

    int peek() throws Exception {
        //O(n)....that is why it is recommended to use circular queue...as it takes O(1)time....in both cases of remove and peek
        if (isEmpty()) throw new Exception("Queue is empty");

        return a[0];
    }

    boolean isFull() {
        return rear == capacity - 1;
    }

    boolean isEmpty() {
        return rear == -1;
    }
}
