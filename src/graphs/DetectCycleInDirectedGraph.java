package graphs;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

    ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    int v;

    public DetectCycleInDirectedGraph(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());
        }
    }

    public boolean isCycle(int src, boolean vis[], boolean recS[]) {
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {//agr visit nhi hua toh hi call kro
                if (dfs(i, vis, recS)) return true;
            }
        }
        return false;
    }

    boolean dfs(int src, boolean vis[], boolean recs[]) {
        vis[src] = true;
        recs[src] = true;
        for (int neighbor : a.get(src)) {
            if (!vis[neighbor]) {
                if (dfs(neighbor, vis, recs)) {
                    return true;
                }
            } else if (recs[neighbor]) {
                return false;
            }
        }
        recs[src] = false;//if there is no outdegree
        return false;
    }

    public static void main(String[] args) {

    }
}