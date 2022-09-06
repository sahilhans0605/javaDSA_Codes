package linkedList;

//1 way Use hashmap...if one element occurs twotimes then cycle is present
//Detect cycle using floyd's cycle detection algorithm
public class DetectACycleInALinkedList {
    public static void main(String[] args) {
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;
        Nodes cycle = detectCycle(n1);
        System.out.println(cycle.data);
        System.out.println(detectMeet(cycle).data);
    }

    private static Nodes detectMeet(Nodes head) {
        Nodes start = head;
        Nodes meet = detectCycle(head);
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }

    private static Nodes detectCycle(Nodes head) {

        Nodes slow = head;
        Nodes fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                return slow;
            }
        }

        return null;
//If we want to delete the cycle we just maintain a prev pointer and point it to prev of meet....and as we get start =meet...we will point prev pointer to null
    }
}