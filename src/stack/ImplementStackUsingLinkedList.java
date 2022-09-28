package stack;

public class ImplementStackUsingLinkedList {
//All operations in O(1)
    //Because the static keyword is meant for providing
    // memory and executing logic without creating Objects,
    // a class does not have a value logic directly,
    // so the static keyword is not allowed for outer class and mainly as mentioned above static
    // can't be used at Package level. It only used within the Class level.

    Node head;
    int size = 0;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void push(int element) {
        Node newNode = new Node(element);
//        if (isEmpty()) {
//            head = newNode;
//            return;
//        }
        newNode.next = head;
        head = newNode;//head change krdiya
        size++;
    }


    int pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");//or we can return -1;
        int ans = head.data;
        head = head.next;
        size--;//***
        return ans;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    int peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty");
        return head.data;//size-- nhi krenge yha pe....
    }


    public static void main(String[] args) {
    }
}
