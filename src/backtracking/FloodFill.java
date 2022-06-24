package backtracking;

import java.util.Scanner;

public class FloodFill {

    // asf -> answer so far
    public static void floodFill(int[][] maze, int sr, int sc, String asf, boolean[][] visited) {
        if (sr >= maze.length || sc >= maze[0].length || sr < 0 || sc < 0 || maze[sr][sc] == 1 || visited[sr][sc]) {
            return;
        }
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }
        visited[sr][sc] = true;
        floodFill(maze, sr - 1, sc, asf + "t", visited);
        floodFill(maze, sr, sc - 1, asf + "l", visited);
        floodFill(maze, sr + 1, sc, asf + "d", visited);
        floodFill(maze, sr, sc + 1, asf + "r", visited);
        visited[sr][sc] = false;//jab sari calls lag gyi and ab vo vaapis jaa rha h toh saare raasto
        // ko false krdo taaki dusre raaste se aaye toh true na dikhe false dikhe aur try kr ske

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        floodFill(arr, 0, 0, "", visited);
    }


}
