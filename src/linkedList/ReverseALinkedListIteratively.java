package linkedList;

public class ReverseALinkedListIteratively {

    static Nodes reverseIteratively(Nodes head) {
        Nodes prev = null;
        Nodes curr = head;
        while (curr != null) {
            Nodes temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;//last pe prev aajayega and vhi head hoga ab use ulta print krwadenge
    }

    static void printLL(Nodes head) {
        Nodes curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        return;
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
        Nodes newHead = reverseIteratively(n1);
        printLL(newHead);
    }
}

class Nodes {
    int data;
    Nodes next;

    public Nodes(int data) {
        this.data = data;
    }
}