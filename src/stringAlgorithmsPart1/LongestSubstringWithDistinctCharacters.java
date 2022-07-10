package stringAlgorithmsPart1;

import java.util.Arrays;

public class LongestSubstringWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        char[] c = s.toCharArray();
        int i = 0;
        int j = 0;
        int index[] = new int[256];
        Arrays.fill(index, -1);
        int ans = 0;
        while (j < c.length) {
            int lastPos = index[c[j]];
            boolean isPresent = true;
            if (lastPos == -1 | lastPos < i) {
                isPresent = false;
            }
            if (isPresent) {
                i = lastPos + 1;
            }
            int curWindowSize = j - i + 1;
            ans = Math.max(ans, curWindowSize);
            index[c[j]] = j;
            j++;
        }
        System.out.println(ans);
    }
}
