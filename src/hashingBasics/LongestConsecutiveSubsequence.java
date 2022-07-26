package hashingBasics;

import java.util.HashSet;
import java.util.Set;

//elements can be found repeated....so we will put them in set first
//after putting them in set we will get all distinct elements..non repeating
//Time complexity is O(n) only...because while loop inside is travelling only for some elements only
//if elements are 5 then the element going in while loop + not going in while loop total iterations sum up to 2n....O(n)
public class LongestConsecutiveSubsequence {

    static void longestConsecutiveSubsequence(int a[]) {
        Set<Integer> set = new HashSet<>();
        int ans = 1;//because agr koi consecutive element nhi mila toh ek element toh hamesha consecutive hota hi h
        for (int e : a) {
            set.add(e);
        }
        int msp = 0;
        for (int e : set) {
            if (set.contains(e - 1)) {
                continue;
            } else {
                int len = 1;
                int tsp = e;
                while (set.contains(++e)) {
                    len++;
                }
                if (len > ans) {
                    ans = len;
                    msp = tsp;
                }
            }

        }
        for (int i = 0; i < ans; i++) {
            System.out.println(msp+i);
        }
    }

    public static void main(String[] args) {
        int a[] = {12, 5, 1, 2, 10, 2, 13, 7, 11, 8, 9, 11, 8, 9, 5, 6, 11};
        longestConsecutiveSubsequence(a);
    }
}
