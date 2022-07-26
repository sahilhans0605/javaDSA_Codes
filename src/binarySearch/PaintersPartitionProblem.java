package binarySearch;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        int a[] = {10, 20, 60, 50, 30, 40};
        int k = 3;
        System.out.print(paintersPartition(a, k));
    }

    private static int paintersPartition(int[] a, int k) {
        int l = 0;
        int r = 0;
        for (int e : a) {
            r += e;
        }
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (isSafe(a, k, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l=mid+1;
            }
        }
        return ans;
    }

    private static boolean isSafe(int[] a, int k, int mid) {
        int painter = 1;
        int units = 0;
        for (int i = 0; i < a.length; i++) {

            if (units + a[i] > mid) {
                painter++;
                units = a[i];
            } else {
                units += a[i];
            }
        }
        return painter <= k;
    }
}
