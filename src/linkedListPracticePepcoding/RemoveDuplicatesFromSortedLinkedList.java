package linkedListPracticePepcoding;

import static linkedListPracticePepcoding.ReverseAlInkedListDataIterative.printLL;

public class RemoveDuplicatesFromSortedLinkedList {

    static Nodes removeDuplicates(Nodes head) {
        if(head==null) return null;
        Nodes curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(2);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(2);
        Nodes n4 = new Nodes(3);
        Nodes n5 = new Nodes(3);
        Nodes n6 = new Nodes(4);
        Nodes n7 = new Nodes(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        Nodes newHead= removeDuplicates(n1);
        printLL(newHead);
    }
}