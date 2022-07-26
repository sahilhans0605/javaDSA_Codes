package hashingBasics;
//TIme complexity will be O(2*N)....every element will be traversed only once

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
// good question
public class LongestSubstringWithoutRepeatingCharacters {
    //Sliding window.........................
    static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {//i jaayega har element pe aur fir agr duplicate mila toh j piche se aayega remove krte krte
            char c = s.charAt(i);
            while (set.contains(c)) {//c element tk element remove krdo saare c ko bhi remve krdo
                set.remove(s.charAt(j));
                j++;
            }
            set.add(c);
            max = Math.max(i - j + 1, max);
            i++;//isko max calculate krne ke baad hi likhna hai
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.print(lengthOfLongestSubstring(s));
    }
}
