package linkedListPracticePepcoding;


import static linkedListPracticePepcoding.ReverseAlInkedListDataIterative.printLL;

public class BubbleSortOnLinkedList {

    static int count(Nodes head) {
        Nodes curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static void bubbleSort(Nodes head) {
        int count = count(head);
        for (int i = 0; i < count; i++) {
            Nodes curr = head;
            Nodes p1 = curr;
            Nodes p2 = p1.next;
            for (int j = 1; j <= count - 1; j++) {
                if (p1.data > p2.data) {
                    Nodes temp = p1.next;
                    p1.next = p2.next;
                    p2.next = temp;
                }
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(10);
        Nodes n2 = new Nodes(1100);
        Nodes n3 = new Nodes(-110);
        Nodes n4 = new Nodes(120);
        Nodes n5 = new Nodes(30);
        Nodes n6 = new Nodes(102);
        Nodes n7 = new Nodes(110);
        Nodes n8 = new Nodes(100);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        bubbleSort(n1);

        printLL(n1);
    }
}
