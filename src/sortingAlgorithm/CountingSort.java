package sortingAlgorithm;

public class CountingSort {

    static int[] countingSort(int[] a) {
        int b[] = new int[a.length];
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            k = Math.max(a[i], k);
        }
        int c[] = new int[k];//or size of c array will be maximum element of a[]
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int j = a.length - 1; j >= 0; j--) {
            b[c[a[j]]] = a[j];
            c[a[j]] = a[a[j]] + 1;
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 1, 2, 7, 5, 2};
        int ans[] = countingSort(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
