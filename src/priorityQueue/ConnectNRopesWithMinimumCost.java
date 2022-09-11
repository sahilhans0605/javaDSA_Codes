package priorityQueue;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimumCost {

    public int ropesWithMinimumCost(int a[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum=0;
        for (int e : a) {
            pq.offer(e);
        }
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;
            sum+=cost;
            pq.offer(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};

    }
}
