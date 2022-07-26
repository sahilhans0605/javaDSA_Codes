package hashingBasics;
//Time complexity O(n) and space complexity O(n)
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsInAnArray {

    static void frequencyOfElements(int a[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : a) {
            if (map.containsKey(e)) {//here we are using containsKey not contains
                int temp = map.get(e);//key get key toh uski count value mil jaayegi
                map.put(e, temp + 1);
            } else {
                map.put(e, 1);
            }
        }
        System.out.println(map);

//        EASY--->
//        for (int e : a) {
//            map.put(e, map.getOrDefault(e, 0) + 1);//one line
//        }
//        System.out.println(map);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 2, 4, 2, 5, 7, 5, 4, 2};
        frequencyOfElements(a);
    }
}
