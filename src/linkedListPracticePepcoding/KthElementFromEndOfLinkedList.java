package linkedListPracticePepcoding;

public class KthElementFromEndOfLinkedList {
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
        int ele = kthNodeFromEnd(n1, 3);
        System.out.println(ele);
    }

    private static int kthNodeFromEnd(Nodes head, int k) {
        Nodes slow = head;
        Nodes fast = head;
        for (int i = 0; i < k; i++) {
//            System.out.println(fast.next.data);
            fast = fast.next;
        }
        while (fast != null) {//fast.next!=null isliye nhi kiya kyoki vo slow ko aage nhi badhne dega....tail waale node se next node
            fast = fast.next;
            slow = slow.next;
//            System.out.println(fast.data);
//            System.out.println(slow.data);
        }
        return slow.data;
    }
}