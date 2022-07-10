package sortingAlgorithm;


import java.util.Arrays;

public class FindTheMinimumDifferenceBetweenTwoElementsInAnArray {
    public static void main(String[] args) {
        int a[] = {6, 18, 1, 9, 14};
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            int diff = a[i + 1] - a[i];
            min = Math.min(diff, min);
        }
        System.out.println(min);
    }
}
