package recursionClassEight;

public class CheckIfAnArrayIsPalindromeUsingRecursion {
//    Sabse phle ye socho ki ye question loop se kese hoga kya isme pointers lene padenge agr haan to same treeka recursion mein lgao

    private static boolean checkPalindromeUsingRecursion(int[] a, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (a[i] == a[j]) {
            return checkPalindromeUsingRecursion(a, i + 1, j - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 2, 1};
        int i = 0;
        int j = a.length - 1;
        if (checkPalindromeUsingRecursion(a, i, j)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }


}
