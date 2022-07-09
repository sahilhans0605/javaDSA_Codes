package stringAlgorithmsPart1;
//Anagrams ---> two strings with same characters and occuring same number of times
//eg permutation of strings are anagrams
// example --->dog and god
// example --->cat and act
// example --->ball and bat are not anagrams

public class CheckIfTwoStringsAreAnagramsOfEachOther {
//    Brute force:::::::...firstly convert string into array ...using toCharArrayMethod...then sort both the arrays and compare
//    Time complexity O(nlogn)...because sorting algorithm requires atleast O(n log n in any case)
//    OPTIMISED APPROACH:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//    Making a character array of 256 length and increase frequency of occurence of each character

//    static boolean anagrams(String s1, String s2) {
//        int a[] = new int[256];
//        for (int i = 0; i < s1.length(); i++) {
//            a[s1.charAt(i)]++;
//        }
//
//        for (int i = 0; i < s2.length(); i++) {
//            a[s2.charAt(i)]--;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != 0) {
//                return false;
//            }
//        }
//        return true;
//
//    }


    public static void main(String[] args) {
        String s1 = "abac";
        String s2 = "aabc";
        System.out.print(anagrams(s1, s2));

    }

    private static boolean anagrams(String s1, String s2) {
        int a[] = new int[256];
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i)]++;
        }

        for (int i = 0; i < s1.length(); i++) {
            a[s2.charAt(i)]--;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;


    }
}
