package sortingAlgorithms2;
//Time complexity is O(m*n)-->m is the length of the longest string and n is the number of strings
//space complexity--->O(m*logn)....n is the number of strings and m is the length of the longest string
public class LongestCommonPrefixUsingDivideAndConquer {
    private static String longestCommonPrefix(String[] s, int l, int h) {
        if (l == h) {
            return s[l];
        }
        int mid = (l + h) / 2;
        String leftPart = longestCommonPrefix(s, l, mid);
        String rightPart = longestCommonPrefix(s, mid + 1, h);
        return merge(leftPart, rightPart);
    }

    private static String merge(String leftPart, String rightPart) {
        int limit = Math.min(leftPart.length(), rightPart.length());
        for (int i = 0; i < limit; i++) {
            if (leftPart.charAt(i) != rightPart.charAt(i)) {
                return leftPart.substring(0, i);
            }
        }
        return leftPart.substring(0, limit);
    }

    public static void main(String[] args) {
        String s[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.print(longestCommonPrefix(s, 0, s.length - 1));
    }

}
