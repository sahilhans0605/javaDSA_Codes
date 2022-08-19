package queue;

//O(1)all operations
public class QueueUsingLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    Node front;
    Node rear;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");
        int ans = front.data;
        front = front.next;
        return ans;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    int getFront() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");
        return front.data;
    }
}
