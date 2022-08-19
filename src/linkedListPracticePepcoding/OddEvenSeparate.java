package linkedListPracticePepcoding;

public class OddEvenSeparate {

    static void oddEven(Nodes head) {
        Nodes odd = head;
        Nodes even = head.next;
        Nodes evenStart = even;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenStart;
        if (even.next != null) {
            even.next = null;
        }
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(5);
        Nodes n6 = new Nodes(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        oddEven(n1);
        printLL(n1);
    }

    private static void printLL(Nodes n1) {
        Nodes curr = n1;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
