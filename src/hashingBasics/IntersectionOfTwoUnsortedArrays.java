package hashingBasics;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoUnsortedArrays {

    static int intersectionOfTwoArrays(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(a[i])) {
                count++;
                set.remove(a[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
