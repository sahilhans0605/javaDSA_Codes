package hashingBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharacterWithHighestFrequency {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        System.out.print(highestFrequencyCharacter(str));
    }

    private static char highestFrequencyCharacter(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }


        char mfc = str.charAt(0);
        for (char key : hm.keySet()) {
            if (hm.get(key) > hm.get(mfc)) {
                mfc = key;
            }
        }
        return mfc;
    }
}
