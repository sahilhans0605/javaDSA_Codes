package dynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

import static dynamicProgramming.LongestIncreasingSubsequence.longestIncreasingSubsequence;

public class MaximumNumberOfNonOverlappingBridges {

    static int maximumNonOverlappingBridges(int a[][]) {
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];//if starting times are same..compare according to ending times
                } else {
                    return o1[0] - o2[0];//when starting times are not same....then compare according to starting times only
                }
            }
        });
        int b[] = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i][1];
        }
        return longestIncreasingSubsequence(b);
    }

    public static void main(String[] args) {

    }
}
