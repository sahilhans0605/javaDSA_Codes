package binarySearch;

public class SearchAnElementInInfiniteSortedArray {

//    here we donot have h means high value(upper bound of array)
//    so we divide question in range.BUT..if we divide it in range of 100 -100...it will be type of linear search so we will get TC of n
//    so we use 2^0,2^1,2^2,2^3,2^4

    static int searchInInfiniteSortedArray(int a[], int key) {
        if (a.length == 0) return -1;
        if (a[0] == key) return 0;
        int index = 1;
        while (a[index] <= key) {
            index *= 2;
        }
        return binarySearch(a, key, index / 2, index);
    }

    static int binarySearch(int a[], int key, int low, int high) {
        int l = low;
        int r = high;
        while (l <= r) {//<= because the element at equal can be our key element to be searched
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (key < a[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 25, 27, 29, 32, 33, 36, 39};
        System.out.print(searchInInfiniteSortedArray(a, 22));
    }
}
