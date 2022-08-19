package linkedListPracticePepcoding;

public class MiddleElementOfLinkedLIst {

    public static void main(String[] args) {
        Nodes n1 = new Nodes(10);
        Nodes n2 = new Nodes(20);
        Nodes n3 = new Nodes(30);
        Nodes n4 = new Nodes(40);
//        Nodes n5 = new Nodes(50);
//        Nodes n6 = new Nodes(60);
//        Nodes n7 = new Nodes(70);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n7.next = n6;
        int ele = middleElementOfLinkedList(n1);
        System.out.println(ele);
    }

    private static int middleElementOfLinkedList(Nodes head) {
        Nodes fast = head;
        Nodes slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
