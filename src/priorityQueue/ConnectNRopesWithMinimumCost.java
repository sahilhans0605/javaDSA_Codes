package priorityQueue;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimumCost {

    static public int ropesWithMinimumCost(int a[]) {//TC is nlogn
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum=0;
        for (int e : a) {
            pq.offer(e);//nlogn
        }
        while (pq.size() > 1) {//pq.size()>1 because atleast 2 elements should be there
            int first = pq.poll();//logn
            int second = pq.poll();//logn
            int cost = first + second;
            sum+=cost;
            pq.offer(sum);//logn
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        ropesWithMinimumCost(a);

    }
}
