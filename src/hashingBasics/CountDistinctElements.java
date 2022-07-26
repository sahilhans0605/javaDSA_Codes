package hashingBasics;

import java.util.*;

public class CountDistinctElements {

    static Set<Integer> countDistinctElements(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int e : a) {
            set.add(e);
        }
        return set;//or if asked we can return set.size();
//        set ke andar automatically distinct elements hi aate h....
//        Hashset use krta h hashmap ko distinct keys waale part ko aur jo value hoti h use private kr deta h toh uska access hi nhi milta hume
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 2, 4, 2, 5, 7, 5, 4, 2};
        for (int e : countDistinctElements(a)) {
            System.out.println(e);
        }
    }
}
