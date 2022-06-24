package backtracking;

// is there a path for rat to reach at bottom right corner
public class RatInAMazeProblem {

    public static boolean ratInAMaze(int a[][], boolean vis[][], int i, int j) {
//        Base conditions
//        i/j==a.length(out of matrix)
//        a[i][j]=0 invalid place...1 pe hi chal skte h
//        vis[i][j] is true...it is already visited
//        O(2^(n^2))--->because every cell can go 2 ways and it is possible that rat goes in whole matrix
        if (i >= a.length || j >= a[0].length || a[i][j] == 0 || vis[i][j]) {
            return false;
        }
//        Destination is successfully reached
        if(i==a.length-1 && j==a.length-1){
            return true;
        }
//        Mark this cell as visited
        vis[i][j] = true;
//        check if a path is possible from down
        if (ratInAMaze(a, vis, i + 1, j)) {
            return true;
        }
        //        check if a path is possible from right
        if (ratInAMaze(a, vis, i, j + 1)) {
            return true;
        }
//        mark these place as unvisited and backtrack
        vis[i][j] = false;//agr upar do conditions row+1 or col+1...i.e right and down se ans nhi aa rha mtlb vha nhi jaana tha toh
//        wha nhi jana tha us jagah ko false krdo
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0},
                {1, 1, 1, 1}};
        boolean vis[][] = new boolean[a.length][a.length];
        boolean isPathPossible = ratInAMaze(a, vis, 0, 0);
        System.out.println(isPathPossible);
    }
}
