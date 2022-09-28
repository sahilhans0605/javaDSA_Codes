package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumOfAbsoluteDifferenceOfAnyPermutation {
    public static void main(String[] args) {
        int a[] = {1, 4, 2, 8};
        Arrays.sort(a);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int counter = 0;
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            if (counter % 2 == 0) {
                arrayList.add(a[i]);
                counter++;
                i++;
            } else {
                arrayList.add(a[j]);
                counter++;
                j--;
            }
        }
        int ans = 0;
        for (int k = 0; k < a.length - 1; k++) {
            ans += Math.abs(arrayList.get(k + 1) - Math.abs(arrayList.get(k)));
            System.out.println(arrayList.get(k + 1) + " " + arrayList.get(k));
        }
        ans += Math.abs(arrayList.get(a.length - 1) - arrayList.get(0));
        System.out.println(ans);
    }
}
