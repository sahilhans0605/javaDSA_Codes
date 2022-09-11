package priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

//brute force...sorting the array...TC nlogn
public class FindTheKthLargestElementInAnArray {
    public static void main(String[] args) {
//        we will make min heap of k size.....TC---> klogk(heap bnaya hai)+(n-k)logk(heap bnaya hai)=nlogk and space complexity k

        Queue<Integer> pq = new PriorityQueue<>();//min heap bnaya
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;

        if (k > a.length) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < k; i++) {
            pq.offer(a[i]);
        }
        for (int i = k; i < a.length; i++) {
            if (pq.peek() < a[i]) {
                pq.poll();
                pq.offer(a[i]);
            }
        }
        System.out.println(pq.peek());
    }
//    for kth smallest element....we will be making max heap..of size k
}
