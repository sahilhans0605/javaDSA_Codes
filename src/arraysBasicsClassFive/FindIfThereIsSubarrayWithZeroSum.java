package arraysBasicsClassFive;

import java.util.HashSet;
import java.util.Set;

//Brute force...traverse in all subarrays of all length
//Technique----------------PREFIX SUM*********************Technique to find subarray with sum 0
public class FindIfThereIsSubarrayWithZeroSum {
    static boolean subarrayWithZeroSum(int a[]) {
//        int prefixSum[] = new int[a.length];
//        rather than array using set here
        Set<Integer> Set = new HashSet<>();
        int sum = 0;
//        2, 5,6,2...toh set ke andar contains function hota h jo btadeta h ki set mein 2 phle se h
//        agr h toh uske beech ka sum 0 hoga....bss time complexity o(1) lgi....set use krne se...search krne mein O(1) lgi
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (Set.contains(sum)) {
                return true;
            }
            Set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 1, -4, 3, -2};
//        int prefixSum[] = {2, 5, 6, 2, 5, 3};
//        Now here 2 comes again means between 2 the sum would have been zero
//        a[i] = currentElement+a[i-1];
//        2 repeat hua ye hum set se pta lgate h...it will come in future
        boolean ans = subarrayWithZeroSum(a);
        System.out.println(ans);
    }
}
