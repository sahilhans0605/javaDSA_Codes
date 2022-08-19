package stack;

import java.util.Stack;

public class ReverseAStackWithoutExtraSpace {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    int size = 0;
    Node head;

    void push(int ele) {
        Node newNode = new Node(ele);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;

    }

    int pop() {
        if (size == 0) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }

    void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
//        System.out.println(head.data);
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
//            return;
        }
    }


    private boolean isEmpty() {
        return size == 0;
    }


    public static void main(String[] args) {
        ReverseAStackWithoutExtraSpace stackWithoutExtraSpace = new ReverseAStackWithoutExtraSpace();
        stackWithoutExtraSpace.push(1);
        stackWithoutExtraSpace.push(2);
        stackWithoutExtraSpace.push(3);
        stackWithoutExtraSpace.push(4);
        stackWithoutExtraSpace.display();
        stackWithoutExtraSpace.reverse();
        stackWithoutExtraSpace.display();
    }
}
