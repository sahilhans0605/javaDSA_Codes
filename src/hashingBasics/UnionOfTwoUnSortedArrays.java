package hashingBasics;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnSortedArrays {
    static void unionOfTwoArrays(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }
        System.out.println("Union contains number of elemeents equal to" + " " + set.size());

        System.out.println(set);
    }

    public static void main(String[] args) {
        int a[] = {1, 33, 5, 6, 2, 33, 5, 7, 3};
        int b[] = {2, 4, 5, 6, 8, 9, 4, 6, 5, 4};
        unionOfTwoArrays(a, b);
    }
}
