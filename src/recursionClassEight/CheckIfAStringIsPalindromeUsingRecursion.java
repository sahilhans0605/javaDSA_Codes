package recursionClassEight;
//Tc is O(n) where n is the lengthof string as every character is traversed once
public class CheckIfAStringIsPalindromeUsingRecursion {
    public static void main(String[] args) {
        String s = "n";
        System.out.print(isPalindrome(s, 0, s.length() - 1));
    }

    private static boolean isPalindrome(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) == s.charAt(j)) {
            return isPalindrome(s, i + 1, j - 1);
        } else {
            return false;
        }
    }
}
