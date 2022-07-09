package sortingAlgorithm;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 5};
        int b[] = {2, 3, 3, 4};
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] > b[j]) {
                System.out.println(b[j]);
                j++;
            }
        }

    }
}
