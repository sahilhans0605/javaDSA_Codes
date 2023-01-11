package sortingAlgorithm;

//O(n*n)  TC
//O(1)  SC
public class BubbleSort {
//STABLE SORTING ALGORITHM
//    static void swap(int[] a, int x, int y) {
//        int temp = a[x];
//        a[x] = a[y];
//        a[y] = temp;
//    }
//
//    static void bubbleSort(int a[]) {
//        for (int i = 0; i < a.length - 1; i++) {
//            boolean isSwapped = false;
//            for (int j = 0; j < a.length - i - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    isSwapped = true;
//                    swap(a, j, j + 1);
//                }
//            }
//            if (!isSwapped) break;//means humne andar j waale loop mein swap nhi kra means aage array sorted hoga
//        }
//    }


    public static void main(String[] args) {
        int a[] = {5, 9, 2, 6, 3, 1, 3};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSwapped = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (!isSwapped) break;
        }
    }
}
