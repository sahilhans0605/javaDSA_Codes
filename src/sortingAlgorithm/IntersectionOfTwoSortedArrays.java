package sortingAlgorithm;

public class IntersectionOfTwoSortedArrays {

//    static void insertionOfTwoSortedArray(int a[], int b[]) {
//        int i = 0;
//        int j = 0;
//
//        while (i < a.length && j < b.length) {
////            If we don't want any element in both sets to repeat again
//            if (i > 0 && a[i] == a[i - 1]) {
//                i++;
//                continue;
//            }
//            if (a[i] == b[j]) {
//                System.out.println(a[i] + " ");
//                i++;
//                j++;
//            } else if (a[i] > b[j]) {
//                j++;
//            } else if (a[i] < b[j]) {
//                i++;
//            }
//        }
//    }

    public static void main(String[] args) {
        int a[] = {2, 5, 6, 6, 8, 8};
        int b[] = {1, 1, 2, 3, 6, 6, 9};
        intersectionOfTwoSortedArray(a, b);

    }

    private static void intersectionOfTwoSortedArray(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }

        }
    }
}
