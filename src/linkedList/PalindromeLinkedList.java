package linkedList;

public class PalindromeLinkedList {
    public static Nodes midPointer(Nodes root) {
        Nodes slow = root;
        Nodes fast = root;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Nodes reverseALinkedList(Nodes root) {
        Nodes curr = root;
        Nodes prev = null;
        while (curr != null) {
            Nodes temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


    public static void main(String[] args) {
        Nodes n1 = new Nodes(2);
        Nodes n2 = new Nodes(4);
        Nodes n3 = new Nodes(1);
        Nodes n4 = new Nodes(3);
        Nodes n5 = new Nodes(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.print(isPalindrome(n1));
    }

    private static boolean isPalindrome(Nodes n1) {
        if (n1 == null) {
            return true;
        }
        Nodes curr = n1;
        Nodes mid = midPointer(n1);
        Nodes last = reverseALinkedList(mid.next);//for even number of elements...next element
        while (last != null) {
            if (curr.data != last.data) {
                return false;
            }
            curr = curr.next;
            last = last.next;
        }
        return true;
    }
}
