//TIme complexity theta n
package arraysBasicsClassFive;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int a[] = {2, 1, 4, 6, 5};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
