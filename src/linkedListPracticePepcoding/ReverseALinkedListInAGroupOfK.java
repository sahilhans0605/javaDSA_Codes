package linkedListPracticePepcoding;

import static linkedListPracticePepcoding.ReverseAlInkedListDataIterative.printLL;

public class ReverseALinkedListInAGroupOfK {

    static Nodes reverseKGroups(Nodes head, int k) {
        Nodes curr = head;
        Nodes prev = null;
        Nodes temp = null;
        int count = 0;
        while (curr != null && count < k) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }
        if (temp != null) {
            head.next = reverseKGroups(temp, k);//3-3 ke groups ko head bna diya aur head.next mein agla element i.e temp pass kr diya
        }
        return prev;
    }

    public static void main(String[] args) {
//        Very important
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(5);
        Nodes n6 = new Nodes(6);
        Nodes n7 = new Nodes(7);
        Nodes n8 = new Nodes(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        Nodes newHead = reverseKGroups(n1, 3);
        printLL(newHead);

    }
}
