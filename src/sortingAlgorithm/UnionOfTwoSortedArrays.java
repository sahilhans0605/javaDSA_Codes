package sortingAlgorithm;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5};
        int[] b = {1, 1, 3, 5, 5, 5};

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
            }
            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                System.out.println(b[j]);
                j++;
            } else if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        if (i < a.length) {
            if (a[i] != a[i - 1]) {
                System.out.println(a[i]);
            }
        }
        if (j < b.length) {
            if (b[j] != b[j - 1]) {
                System.out.println(b[j]);
            }
        }
    }
}