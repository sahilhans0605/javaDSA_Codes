package recursionClassEight;

public class MoveAllXToTheEndOfTheString {
//time complexity O(n+count)=O(n+n)=O(2n)
    static void moveAllX(String s, int i, String newString, int countOfX) {
        if (i == s.length()) {
            for (int it = 0; it < countOfX; it++) {//remember base case mein hi output dena h..niche waala function toh chlta rhega...
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if (s.charAt(i) != 'x') {
            newString += s.charAt(i);
        } else {
            countOfX++;
        }
        moveAllX(s, i + 1, newString, countOfX);
    }

    public static void main(String[] args) {
        String s = "axbcxxd";
        String newString = "";
        int i;
        int countOfX = 0;
        moveAllX(s, 0, newString, countOfX);
    }
}
