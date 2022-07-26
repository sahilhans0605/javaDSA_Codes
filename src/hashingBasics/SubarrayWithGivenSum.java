package hashingBasics;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenSum {

    static void subArrayWithGivenSum(int a[], int sum) {
        Map<Integer, Integer> map = new HashMap();
        int curr_sum = 0;
        for (int i = 0; i < a.length; i++) {
            curr_sum += a[i];
            if (curr_sum == sum) {
                System.out.println("Subarray lies between" + 0 + "to" + " " + i);
                return;
            } else if (map.containsKey(curr_sum - sum)) {//yha pe hum sum-curr_sum ko key le rhe h
                System.out.println("Subarray lies between" + (map.get(curr_sum - sum) + 1) + " " + i);
                return;
            }
            map.put(curr_sum, i);
        }
        System.out.println("Subarray not found");
    }

    public static void main(String[] args) {
        int a[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        subArrayWithGivenSum(a, sum);
    }
}
