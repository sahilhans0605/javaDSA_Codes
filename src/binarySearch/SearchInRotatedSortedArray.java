package binarySearch;

//All elements are distinct ...binary search lgwana chahte h
public class SearchInRotatedSortedArray {

    static int searchInRotatedArray(int a[], int key) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[l] <= a[mid]) {//left part sorted....less than equal to because mid can also be equal to a[l]
//                we are trying to find the pivot point here
//                Checking if it is sorted
                if (key >= a[l] && key < a[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (key > a[mid] && key <= a[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {3, 1};
        int key = 1;
        System.out.println(searchInRotatedArray(a, key));
    }
}
