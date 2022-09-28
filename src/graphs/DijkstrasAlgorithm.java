package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//O(E log E)...TC
//Spacd complexity ...O(V+E)
public class DijkstrasAlgorithm {

    static class Pair implements Comparable<Pair> {
        int v;
        int wt;

        public Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }

        public int compareTo(Pair that) {
            return this.wt - that.wt;
        }
    }

    static int[] shortestDistance(int src, int v, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        boolean vis[] = new boolean[v];
        queue.add(new Pair(src, 0));
        int ans[] = new int[v];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        while (queue.size() != 0) {
            Pair cur = queue.poll();
            int u = cur.v;
            if (!vis[u]) {
                continue;
            }
            vis[u] = true;
            ArrayList<ArrayList<Integer>> neighbor = adj.get(u);//neighbors pe jaao
            for (ArrayList<Integer> a : neighbor) {
                int vertex = a.get(0);
                int wt = a.get(1);
                if (ans[vertex] > ans[u] + wt) {
                    ans[vertex] = ans[u] + wt;
                    queue.add(new Pair(vertex, ans[vertex]));
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
