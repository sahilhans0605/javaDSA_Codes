package priorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SplitArrayInKSubsets {
    //sabse bade element ko sabse chhote sum  waali bucket mein daaldo...because maximum sum should be minimum
//elements ko evenly distribute krna hai...toh maximum element ko minumum sum waali bucket mein daalenge
    static int splitArrayInKSubsets(int a[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.offer(0);
        }
        Arrays.sort(a);

        for (int i = a.length - 1; i >= 0; i--) {
            int top = pq.poll();
            int curr = a[i];
            pq.offer(top + curr);
        }
        int max = -1;
        for (int e : pq) {
            max = Math.max(e, max);
        }
        return max;
    }


    public static void main(String[] args) {
        int a[] = {1, 4, 2, 3, 7, 2, 4, 5, 6, 3};
        int k = 3;
        System.out.println(splitArrayInKSubsets(a, k));

    }
}
