package linkedListPracticePepcoding;

public class MergeTwoSortedLinkedList {

    static Nodes mergeTwoSortedLinkedList(Nodes head1, Nodes head2) {

        Nodes head = null;
        Nodes tail = null;
        Nodes curr1 = head1;
        Nodes curr2 = head2;

        if (curr1 == null) return curr2;
        if (curr2 == null) return curr1;

        if (curr1.data <= curr2.data) {
            tail = curr1;
            head = curr1;
            curr1 = curr1.next;
        } else {
            tail = curr2;
            head = curr2;
            curr2 = curr2.next;
        }
        while (curr1 != null && curr2 != null) {
            if (curr1.data <= curr2.data) {
                tail.next = curr1;
                tail = curr1;
                curr1 = curr1.next;
            } else {
                tail.next = curr2;
                tail = curr2;
                curr2 = curr2.next;
            }
        }
        if (curr1 == null) tail.next = curr2;
        if (curr2 == null) tail.next = curr1;
        return head;
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(4);
        Nodes n6 = new Nodes(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Nodes x1 = new Nodes(1);
        Nodes x2 = new Nodes(1);
        Nodes x3 = new Nodes(1);
        Nodes x4 = new Nodes(1);
        Nodes x5 = new Nodes(1);
        Nodes x6 = new Nodes(1);
        Nodes x7 = new Nodes(1);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        x6.next = x7;
        Nodes head = mergeTwoSortedLinkedList(n1, x1);
        printLL(head);
    }

    private static void printLL(Nodes head) {
        Nodes curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}