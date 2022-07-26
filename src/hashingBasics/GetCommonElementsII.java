package hashingBasics;

import java.util.HashMap;

public class GetCommonElementsII {
    public static void main(String[] args) {
        int a1[] = {1, 1, 2, 2, 2, 3, 5};
        int a2[] = {1, 1, 1, 2, 2, 4, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
        }
//        System.out.println(map);
//
        for (int i = 0; i < a2.length; i++) {
            if (map.containsKey(a2[i])) {
                if (map.get(a2[i]) == 1) {
                    map.remove(a2[i]);
                    System.out.println(a2[i]);
                } else {
                    map.put(a2[i], map.get(a2[i]) - 1);
                    System.out.println(a2[i]);
                }
            }
        }
    }
}
