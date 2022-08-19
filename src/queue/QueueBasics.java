package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) throws Exception {
//        FIFO
//        push->enqueue
//        pop->dequeue...queue hai
//        ArrayDeque<>....stack bnate h isse
//        Front and rear operation
//        enqueue operation on front and
//        dequeue operation on rear end


        Queue<Integer> q = new LinkedList<>();//because queue is not a class, it is an interface....and interface se object nhi bnta

//        Implementing queue using linked list....Front=rear=null....return front==null

        QueueUsingLinkedList qll = new QueueUsingLinkedList();
        QueueUsingArray qlla = new QueueUsingArray(5);
        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);
        qll.enqueue(40);
        qll.enqueue(50);

        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());
        System.out.println(qll.dequeue());

    }
}
