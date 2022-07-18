package binarySearch;

public class UpperBoundOfAnElementInASortedArray {

    static int upperBound(int[] a, int key) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                ans = mid;
                l = mid + 1;
            } else if (a[mid] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
                ans = mid;//upper bound nikaalna tha tbhi l=mid+1 waale ke saath kiya
            }
        }
        if (l == a.length) {
            return -1;
        }
        return (ans + 1);//usse upper waala element print krna h
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 5, 6, 8, 9, 12};
        int key = 12;
        System.out.println(upperBound(a, key));
    }
}
