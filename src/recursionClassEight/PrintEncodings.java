package recursionClassEight;

public class PrintEncodings {

    static void printEncodings(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            } else {//sirf ek hi char h toh use aise hi print krdo
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                System.out.println(asf + code);
            }
        } else {
//            if string length is greater than 1
            char ch = str.charAt(0);
            String roq = str.substring(1);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                printEncodings(roq, asf + code);
            }

            String ch12 = str.substring(0, 2);
            String roq12 = str.substring(2);

            int chv12 = Integer.parseInt(ch12);//yha pe seedha integer bna diya...-'0' krne ki jarurat nhi h
            if (chv12 <= 26) {
                char code12 = (char) ('a' + chv12 - 1);
                printEncodings(roq12, asf + code12);
            }
        }
    }


    public static void main(String[] args) {
        String str = "123";
        printEncodings(str, "");
    }
}
