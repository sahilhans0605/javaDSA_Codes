package linkedListPracticePepcoding;

import static linkedListPracticePepcoding.ReverseALinkedListPointerIterative.printLL;

public class ReverseALinkedListRecursive {

    static Nodes reverseRecursive(Nodes head) {
        if (head == null || head.next == null) {
            return head;
        }
        Nodes temp = head.next;
        Nodes newNode = reverseRecursive(head.next);
        temp.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(10);
        Nodes n2 = new Nodes(20);
        Nodes n3 = new Nodes(30);
        Nodes n4 = new Nodes(40);
        Nodes n5 = new Nodes(50);
        Nodes n6 = new Nodes(60);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printLL(n1);
        System.out.println();
        Nodes head = reverseRecursive(n1);
        printLL(head);
    }
}
