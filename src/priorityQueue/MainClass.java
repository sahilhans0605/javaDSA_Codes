package priorityQueue;

import java.util.PriorityQueue;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(10);
        pq.offer(9);
        pq.offer(1);
//        toh ab queue waali property follow nhi hongi min heap waali hongi sorted order mein peek hongi
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

        System.out.println("__________________________________________________");

//        but to implement maxHeap ... we use comparator
        Queue<Integer> pq2= new PriorityQueue<>(Collections.reverseOrder());//ye maxHeapki trh operate krega
        pq2.offer(5);
        pq2.offer(10);
        pq2.offer(9);
        pq2.offer(1);
//        toh ab queue waali property follow nhi hongi max heap waali hongi sorted order mein peek hongi
        System.out.println(pq2.peek());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());

    }
}
