package greedyAlgorithm;
//O(N) time complexity
public class MaximumProductSubsetOfAnArray {
    public static void main(String[] args) {
        int zero = 0;
        int negative = 0;
        int maxNegative = Integer.MIN_VALUE;
        int prod = 1;
        int a[] = {0, 0, -2};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zero++;
                continue;
            }
            if (a[i] < 0) {
                negative++;
                maxNegative = Math.max(maxNegative, a[i]);
            }
            prod = prod * a[i];
        }
        if (zero == a.length) {
            System.out.println(0);
            return;
        }

        if (negative == 1 && zero + negative == a.length) {
            System.out.println(0);
            return;
        }
        if ((negative & 1) != 0) {
            prod = prod / maxNegative;
        }
        System.out.println(prod);
    }
}
