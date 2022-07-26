package binarySearch;

public class AggressiveCowsProblem {

    static int aggressiveCowsAllocation(int a[], int k) {
        if (a.length < k) {
            return -1;
        }
        int l = 0;
        int r = a[a.length - 1];
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (isSafe(a, k, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isSafe(int[] a, int k, int mid) {
        int distance = a[0];
        int cowCount = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] - distance >= mid) {
                cowCount++;
                distance = a[i];
                if (cowCount == k) {
                    return true;
                }
            }
        }
        return cowCount >= k;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCowsAllocation(a, k));
    }
}
