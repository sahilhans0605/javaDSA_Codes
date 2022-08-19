package linkedListPracticePepcoding;

public class ReverseAlInkedListDataIterative {

    static Nodes getNodeAt(int idx, Nodes head) {
        Nodes curr = head;
        for (int i = 0; i < idx; i++) {
            curr = curr.next;
        }
        return curr;
    }

    static void printLL(Nodes head) {
        Nodes cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    static Nodes reverseDataIterative(Nodes head) {
        Nodes cur = head;
        int size = 0;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        int i = 0;
        int r = size - 1;
        Nodes current = head;
        while (i < r) {
            Nodes l1 = getNodeAt(i, head);
            Nodes r1 = getNodeAt(r, head);

            int temp = l1.data;
            l1.data = r1.data;
            r1.data = temp;
            i++;
            r--;
        }
        return head;
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
        Nodes newNode = reverseDataIterative(n1);
        printLL(newNode);
    }
}

class Nodes {
    int data;
    Nodes next;

    public Nodes(int data) {
        this.data = data;
    }
}
