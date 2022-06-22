package recursionClassEight;

import java.util.HashSet;
import java.util.Set;
// 2-2 ke usme h 2^0+2^1+2^2+...2^n-1 TIME COMPLEXITY-->2^n
// space complexity....at most 3 things in stack can go...stack height at most n ...O(N)
// subsequence--->A string formed using the original stringby removing zero or more characters
public class GenerateAllSubsetsORSusequenceOfAString {
    static void generateAllSubsets(String s) {
        Set<String> set = new HashSet<>();
        utilGenerateAllSubsets(s, 0, "", set);//i=0;//curr = current string
        for(String st: set){
            System.out.println(st);
        }
    }

    static void utilGenerateAllSubsets(String s, int i, String curr,Set<String>set) {
        if (i == s.length()) {
            set.add(curr);//we are using set here because if we give input as "aaa" it will repeat elements but set does not store repeated elements
//            System.out.println(curr);
            return;
        }
        utilGenerateAllSubsets(s, i + 1, curr,set);//current length =0 rhegi
        utilGenerateAllSubsets(s, i + 1, curr + s.charAt(i),set);//fir ek ek char add hoga
        //ya toh char hoga ya nhi hoga toh ek function mein add krdiya aur ek mein uski jagah empty char
    }

    public static void main(String[] args) {
//        generateAllSubsets("abc");
        generateAllSubsets("aaa");

    }
}
