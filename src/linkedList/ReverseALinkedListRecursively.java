package linkedList;

public class ReverseALinkedListRecursively {

    static Nodes reverseRecursively(Nodes head) {
        if (head == null || head.next == null) {
            return head;
        }
        Nodes newNode= reverseRecursively(head.next);//baar baar next head pe jaayega and at the end it will reach to last node....which we will called as newNode
        head.next.next=head;
        head.next=null;
        return newNode;//we will again and again return newHead...which will help us to make bonds again and again....
        //newNode return kiya mtlb last node to return krdiya as head
    }

    static void printLL(Nodes head) {
        Nodes cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Nodes n1 = new Nodes(100);
        Nodes n2 = new Nodes(200);
        Nodes n3 = new Nodes(300);
        Nodes n4 = new Nodes(400);
        Nodes n5 = new Nodes(500);
        Nodes n6 = new Nodes(600);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Nodes newNode = reverseRecursively(n1);
        printLL(newNode);
    }
}