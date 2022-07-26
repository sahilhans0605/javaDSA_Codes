package hashingBasics;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {

    static int largestSubArrayZeroSum(int[] a) {
        int curr_sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            curr_sum += a[i];
            if (map.containsKey(curr_sum)) {
                max = Math.max((i - map.get(curr_sum)), max);
            } else {
                map.put(curr_sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {2, 5, -3, -4, 2, 3, 2};
        int max = largestSubArrayZeroSum(a);
        System.out.println(max);
    }
}