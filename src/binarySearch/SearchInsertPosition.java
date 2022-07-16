package binarySearch;

public class SearchInsertPosition {

    static int searchInsertPosition(int a[], int key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;//at the end l points to that position at which it should be if element is not found
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6};
        int key = 2;
        System.out.println(searchInsertPosition(a, key));

    }
}