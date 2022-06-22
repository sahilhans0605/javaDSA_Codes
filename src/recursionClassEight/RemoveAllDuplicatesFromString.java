package recursionClassEight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//O(n)--->n length of string
public class RemoveAllDuplicatesFromString {
//    SET ki help se
//    static void removeDuplicates(String s, int i, Set<Character> set) {
//        if (i == s.length()) {
//for(String st:set)
//
//    {
//        System.out.println(st);
//    }//            return;
//        }
//
//        if (!set.contains(s.charAt(i))) {
//            set.add(s.charAt(i));
//        }
//        removeDuplicates(s, i + 1, set);

    //    }

    static void removeDuplicates(String s, int i, String newString, Boolean[] map) {

        if (i == s.length()) {
            System.out.println(newString);
            return;
        }
        int curr = (s.charAt(i) - 'a');
        if (!map[curr]) {
            map[curr] = true;
            newString += s.charAt(i);
        }
        removeDuplicates(s, i + 1, newString, map);
    }

    public static void main(String[] args) {
        String s = "abbccda";
//        Set<Character> set = new HashSet<>();
//        removeDuplicates(s, 0, set);
        String newString = "";
        Boolean[] map = new Boolean[26];
        Arrays.fill(map, false);
        removeDuplicates(s, 0, newString, map);
    }
}
