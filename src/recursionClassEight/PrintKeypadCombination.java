package recursionClassEight;

public class PrintKeypadCombination {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    static void printCombinations(String num, int index, String combination) {
        if (index == num.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = num.charAt(index);
        //easy h phli string numbers ki h uska char nikala...uske character se uss mapping ki string nikaalke add krte gye

        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(num, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String number = "11";
        printCombinations(number, 0, "");
    }
}
