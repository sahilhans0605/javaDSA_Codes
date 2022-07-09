package sortingAlgorithm;
//Insertion Sort is optimised technique of bubble sort it does not have n*n in worst case but less than n*n
//STABLE SORTING ALGORITHM
public class InsertionSort {
    //    thing we use here is that we assume one element is always sorted
//    static void insertionSort(int a[]) {
//        for (int i = 1; i < a.length; i++) {
//            int temp = a[i];
//            int j = i - 1;
//            for (; j >= 0; j--) {
//                if (a[j] > temp) {
//                    a[j + 1] = a[j];
//                } else {
//                    break;
//                }
//            }
//            a[j + 1] = temp;
//        }
//    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,-2,9,-1};
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}