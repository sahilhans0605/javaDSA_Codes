package priorityQueue;
//https://www.geeksforgeeks.org/maximize-profit-possible-by-selling-m-products-such-that-profit-of-a-product-is-the-number-of-products-left-of-that-supplier/
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumProfitPossibleBySellingMProducts {

    static int maximumProfit(int a[], int M) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            pq.offer(a[i]);
        }
        while (M > 0) {
            int max = pq.poll();
            pq.offer(max - 1);
            sum += max;
            M--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int M = 2;
        int a[] = {1, 2, 3};
        System.out.print(maximumProfit(a, M));
    }
}
