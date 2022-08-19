package linkedListPracticePepcoding;

import java.util.LinkedList;

import static linkedListPracticePepcoding.ReverseALinkedListPointerIterative.printLL;

public class IntersectionOfTwoSortedLinkedList {

    static LinkedList<Integer> intersectionOfTwoSortedLinkedLists(Nodes head1, Nodes head2) {
        LinkedList<Integer> ll = new LinkedList<>();
        Nodes curr1 = head1;
        Nodes curr2 = head2;
        while(curr1!=null && curr2!=null){
            if (curr1.data == curr2.data) {
                ll.add(curr1.data);
                curr1=curr1.next;
                curr2=curr2.next;
            } else if (curr1.data < curr2.data) {
                curr1 = curr1.next;
            } else {
                curr2 = curr2.next;
            }
        }
        return ll;
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(4);
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(4);
        Nodes n6 = new Nodes(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Nodes x1 = new Nodes(1);
        Nodes x2 = new Nodes(2);
        Nodes x3 = new Nodes(3);
        Nodes x4 = new Nodes(4);
        Nodes x5 = new Nodes(4);
        Nodes x6 = new Nodes(4);
        Nodes x7 = new Nodes(4);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        x6.next = x7;
        LinkedList<Integer>ll = intersectionOfTwoSortedLinkedLists(n1,x1);
        System.out.println(ll);
    }
}
