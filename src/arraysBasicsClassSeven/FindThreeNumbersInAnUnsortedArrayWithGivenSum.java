package arraysBasicsClassSeven;

import java.util.Arrays;
import java.util.Collections;

public class FindThreeNumbersInAnUnsortedArrayWithGivenSum {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 7, 3, 5, -2, 1};
        int sum = 9;
        Arrays.sort(a);//O(NlogN)---and O(N) for loop...O(NlogN+N)===>O(NlogN)
        int start = 0;
        int end = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum - (a[start] + a[end])) {
                System.out.println(a[start] + " " + a[end] + " " + a[i]);
                return;
            }
            if (a[start] + a[end] < sum) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println("Does not exist");
    }
}
