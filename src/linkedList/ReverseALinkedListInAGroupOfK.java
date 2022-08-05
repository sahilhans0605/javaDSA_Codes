package linkedList;

import static linkedList.ReverseALinkedListIteratively.printLL;

public class ReverseALinkedListInAGroupOfK {

    static Nodes reverseK(Nodes head, int k) {
        Nodes curr = head;
        Nodes prevFirst = null;
        Nodes newHead = null;
        while (curr != null) {
            int count = 0;
            Nodes prev = null;//ye har k-k ke pairs ke liye hoga
            Nodes first = curr;
            while (curr != null && count < k) {
                Nodes temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                count++;
            }
            if (newHead == null) {
                newHead = prev;
            } else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(10);
        Nodes n2 = new Nodes(20);
        Nodes n3 = new Nodes(30);
        Nodes n4 = new Nodes(40);
        Nodes n5 = new Nodes(50);
        Nodes n6 = new Nodes(60);

        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next = n6;
        Nodes newHead =reverseK(n1,3);
        printLL(newHead);
    }
}
