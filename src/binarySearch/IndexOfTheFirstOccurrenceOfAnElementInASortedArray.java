package binarySearch;

public class IndexOfTheFirstOccurrenceOfAnElementInASortedArray {

    static int leftOccurrence(int a[], int key) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;//*****************************************************************
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                ans = mid;
                r = mid - 1;
            } else if (a[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 4, 4, 5, 9, 9, 11, 11, 11, 14};//sorted array
        int key = 3;
        System.out.println(leftOccurrence(a, key));
    }
}