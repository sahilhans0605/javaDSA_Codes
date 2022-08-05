package linkedList;

class Node<T> {//it is a generic which represents any type of class which will be used in the whole code
    T data;
    Node<T> next;//next is not an object it is just a reference
//    // next point automatically refers to null always automatically

    public Node(T data) {
        this.data = data;
    }
}

public class LinkedListTraversal {

    static void printLL(Node<Integer> head) {
//        the elements are present at different diff places....suppose if one is present at memory location 2040...another may be at 2000...they are not in contiguous memory location they just have the references of one another
        Node<Integer> curr = head;//node ka ek object...
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("end");
    }


    static Node<Integer> insertLL(int data, int position, Node<Integer> head) {
        Node<Integer> newNode = new Node<>(data);
        if (position == 0) {//means to insert at start...
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> cur = head;
        for (int i = 0; i < position - 1; i++) {//as it is 0 based indexing
            cur = cur.next;
            if (cur.next == null) return head;//means it has reached the end of linked list

        }
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }

    static Node<Integer> deleteLL(int position, Node<Integer> head) {
        if (position == 0) {
            head = head.next;
            return head;
        }
        Node<Integer> curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;//wow
        return head;
    }

    static int findMiddleLL(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        if(slow==null){
            return 0;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);
        Node<Integer> n6 = new Node<Integer>(60);
        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printLL(null);
        System.out.println();
        //ye head return krdeta h ki bhai nyi linkedlist bnai h uska head bhej rha hu...vo head use krke linked list print krwa do
//suppose if data is null....then curr.data will print null so as to handle it we will make data of type Integer
//        System.out.println();
//        printLL(insertLL(100, 2, head));//position is index
//        System.out.println();
//        printLL(deleteLL(3, head));//position is index
        System.out.println(findMiddleLL(head));
        System.out.println(findMiddleLL(null));//linked list is empty
    }
}