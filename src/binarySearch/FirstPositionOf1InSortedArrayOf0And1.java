package binarySearch;

public class FirstPositionOf1InSortedArrayOf0And1 {
//Sorted array h bhai...
    static int firstPositionOf1(int a[]) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == 1 && (mid == 0 || a[mid - 1] == 0)) {
                return mid;
            } else if (a[mid] == 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {0, 0, 1, 1, 1, 1};
        int ans = firstPositionOf1(a);
        System.out.println(ans);
    }
}
