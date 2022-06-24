package recursionClassEight;

import java.util.Scanner;

public class PrintMazePathWithJumps {

    public static void printMazePathsJump(int sr, int sc, int dr, int dc, String psf) {

        if (sr > dr || sc > dc) {
            return;
        }

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        for (int i = 1; i <= dc; i++) {
            printMazePathsJump(sr, sc + i, dr, dc, psf + "h" + i);
        }

        for (int i = 1; i <= dr; i++) {//i==1 se isliye kyoki atleast ek step toh chalega..nhi toh saare variable same hi h kuch add nhi ho rha
            printMazePathsJump(sr + i, sc, dr, dc, psf + "v" + i);
        }

        for (int i = 1; i <= dr && i <= dc; i++) {
            printMazePathsJump(sr + i, sc + i, dr, dc, psf + "d" + i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePathsJump(0, 0, n - 1, m - 1, "");
    }
}
