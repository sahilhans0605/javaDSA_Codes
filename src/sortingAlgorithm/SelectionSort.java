package sortingAlgorithm;
//UNSTABLE SORTING ALGORITHM
public class SelectionSort {
    //    First element sorted h...aage ke array mein se min element nikaalke starting waale element se swap krdo
    public static void main(String[] args) {
        int a[] = {5, 9, 3, 6, 1, 2};
        selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}