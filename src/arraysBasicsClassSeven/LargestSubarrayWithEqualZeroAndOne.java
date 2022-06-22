package arraysBasicsClassSeven;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithEqualZeroAndOne {
    public static void main(String[] args) {
        int a[] = {0, 0, 0, 0, 1, 0, 1, 1, 0, 1};
//O(N^2)--------------------Brute force
//        int zeroes = 0;
//        int ones = 0;
//        int ans = 0;
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] == 0) {
//                    zeroes++;
//                } else {
//                    ones++;
//                }
//                if (zeroes == ones) {
//                    ans = Math.max(ans, 2 * zeroes);
//                }
//            }
//        }
//--------Optimised approach----agr 0 hai to -1 krlo else agr 1 hai toh +1 krdo
        int prefixSum[] = new int[a.length];
        prefixSum[0] = a[0] == 0 ? -1 : 1;
        //agr element 0 h toh -1 vrna +1 in previous added sum
        for (int i = 1; i < a.length; i++) {
            prefixSum[i] = a[i] == 0 ? prefixSum[i - 1] - 1 : prefixSum[i - 1] + 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(prefixSum[i])) {//0 ko -1 treat kiya toh basically 0(-1)+1(1)=0
//                toh means same 0 and 1 chahiye mtlb s=sum 0 hona chahiye un sab ko add krke...to maximum length jab do sum same honge...prefix sum waala logic
                ans = Math.max(ans, i - map.get(prefixSum[i]));//maximum value of j-i
            } else {
                map.put(prefixSum[i], i);
            }
        }
        System.out.println(ans);
    }
}
