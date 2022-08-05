package recursionClassEight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//O(n)--->n length of string
public class RemoveAllDuplicatesFromString {
    //    SET ki help se
    static Set<Character> removeDuplicates(String s, int i, Set<Character> set) {
        if (i == s.length()) {
            return set;
        }

        set.add(s.charAt(i));

        return removeDuplicates(s, i + 1, set);
    }

    static void removeDuplicates(String s, int i, String newString, Boolean[] map) {
//
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
        String s = "abbccd-1a";//- alag xchar h and 1 alag char hai
        Set<Character> set = new HashSet<>();
//        removeDuplicates(s, 0, set);
        String newString = "";
        Boolean[] map = new Boolean[26];
        Arrays.fill(map, false);
        removeDuplicates(s, 0, newString, map);
        System.out.print(removeDuplicates(s, 0, set));
    }
}