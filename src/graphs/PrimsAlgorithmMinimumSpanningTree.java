package graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

//Time complexitty as priority queue is used....E(logE)
//space complexity--->O(V+E)
public class PrimsAlgorithmMinimumSpanningTree {

    static class Pair implements Comparable<Pair> {
        int wt, v;

        public Pair(int wt, int v) {
            this.wt = wt;
            this.v = v;
        }

        public int compareTo(Pair that) {
            return this.wt - that.wt;
        }
    }

    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        boolean[] vis = new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0, 0));
        int ans = 0;//total sum of minimum edges
        while (q.size() != 0) {
            Pair cur = q.poll();//minimum waala hi poll hoga
            int u = cur.v;
            if (vis[u]) {
                continue;
            }
            ans += cur.wt;
            vis[u] = true;
            ArrayList<ArrayList<Integer>> neighbor = adj.get(u);
            for (ArrayList<Integer> list : neighbor) {
                int vertex = list.get(0);
                int wt = list.get(1);
                if (vis[vertex] == false) {
                    q.add(new Pair(vertex, wt));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
