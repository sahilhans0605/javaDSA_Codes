package binarySearch;

// TC=====> O(log(sum))*n
public class BookAllocationProblem {
//agr hum har element ke baad cut lgake check krein toh usse time complexity aayegi O(2^n)
//    yha par number of pages distributed pe binary search lgayenge kyoki number of pages minimum hone chahiye

    static int bookAllocation(int a[], int k) {
        if (k > a.length) {
            return -1;
        }
        int l = 0;
        int r = 0;
        for (int i = 0; i < a.length; i++) {
//            l = Math.max(l, a[i]);//min agr hum demand krenge toh maximum hi milega
            r += a[i];
        }
        int res = -1;//we can take any values of l and r
        while (l <= r) {
            int mid = (l + r) / 2;
            if (isSafe(a, k, mid)) {
                r = mid - 1;
                res = mid;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    private static boolean isSafe(int[] a, int k, int mid) {
        int student = 1;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

//            if (sum > mid) {
//                return false;
//            }

            if (sum + a[i] > mid) {//because books nhi le skte same mein se isliye >= nhi kiya
                student++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }

        return student <= k;
    }

    public static void main(String[] args) {
        int a[] = {50, 100, 250, 150};
        int key = 2;
        System.out.println(bookAllocation(a, key));
    }
}