package arraysBasicsClassSeven;

import java.util.Arrays;
import java.util.Collections;
//O(NlogN)---and O(N) for loop...O(NlogN+N)===>O(NlogN)
public class FindThreeNumbersInAnUnsortedArrayWithGivenSum {
    public static void main(String[] args) {
        int a[] = {-1,2,1,-4};
        int sum = 1;
        Arrays.sort(a);
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
