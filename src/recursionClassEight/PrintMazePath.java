package recursionClassEight;

import java.util.Scanner;

public class PrintMazePath {
    static void printMazePath(int sr, int sc, int dr, int dc, String psf) {
        if (sr > dr || sc > dc) {
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        printMazePath(sr, sc + 1, dr, dc, psf + 'h');
        printMazePath(sr + 1, sc, dr, dc, psf + 'v');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePath(0, 0, n - 1, m - 1, "");
    }
}
