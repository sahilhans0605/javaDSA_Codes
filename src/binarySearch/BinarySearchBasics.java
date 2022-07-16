package binarySearch;

//It works for sorted array>>>>>
//n/2----n/4-----n/8------>log2n time complexity
//Iterative vs recursive--->
//Iterative because it does not make variables again and again(recommended and faster)
//Recursive---->(takes space here and will make pointers again and again)--Overhead is created here
//Jab bhi dikhe ki O(n) se bhi kam mein chahiye toh obviously use binary search(array should be sorted)
public class BinarySearchBasics {
//    also imp-->
//    we should use l+(r-l)/2...to find out mid
//    mid=l+r/2...gives time limit exceeded sometimes

    static int binarySearch(int a[], int key) {
        int l = 0;
        int r = a.length - 1;
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
        int a[] = {1, 2, 4, 5, 9, 11, 14};//sorted array
        int key = 1;
        System.out.println(binarySearch(a, key));
    }
}
