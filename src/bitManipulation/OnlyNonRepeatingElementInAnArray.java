package bitManipulation;

// only one element is present once in set else all elements are present twice
public class OnlyNonRepeatingElementInAnArray {

    static int oneNonRepeatingElement(int a[]) {
        int ans = 0;
        for (int e : a) {
            ans = ans ^ e;
        }
        return ans;
    }

    public static void main(String[] args) {
//        now logic:
//        If we XOR two same numbers the answer becomes zero
        int a[] = {2, 4, 2, 1, 1, 3, 4};
        System.out.print(oneNonRepeatingElement(a));
    }
}
