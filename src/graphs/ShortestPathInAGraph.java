package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInAGraph {
    int v;//vertex
    static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

    public ShortestPathInAGraph(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            arrayList.add(new ArrayList<>());
        }
    }

    public static void bfs(int src, boolean vis[], int dis[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        vis[src] = true;
        dis[src] = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int neighbour : arrayList.get(cur)) {
                if (!vis[neighbour]) {
                    dis[neighbour] = dis[cur] + 1;
                    queue.add(neighbour);
                    vis[neighbour] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
//        src and dest are given
//        IN adjacency list

        int v = 4;//4vertices
        GraphList graph = new GraphList(v);
        graph.addEdge(0, 1);//0 to 1 an edge should be there
        graph.addEdge(2, 3);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);
        boolean vis[] = new boolean[v];
        int[] dis = new int[v];
        Arrays.fill(dis, Integer.MAX_VALUE);
        bfs(0, vis, dis);
        for (int i = 0; i < dis.length; i++) {
            System.out.println(dis[i] + " " + i);
        }
    }
}
