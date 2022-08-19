package hashingBasics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PalloAltoQuestion {
    public static void main(String[] args) {
        int a[] = {3, 4, 3, 3, 4, 5, 5, 6, 5, 6};
        int k = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(map);
        int count = 0;
        int minBrands = 0;
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            count += it.getValue();
            map.remove(it);
            minBrands++;
            if (count >= k) {
                break;
            }
        }
        System.out.println(minBrands);
    }
}