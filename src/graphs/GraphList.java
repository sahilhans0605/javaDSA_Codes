package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphList {

    static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
    int v;//vertex

    public GraphList(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            arrayList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        arrayList.get(src).add(dest);
        arrayList.get(dest).add(src);
    }

    public static void dfs(int src, boolean vis[]) { //src will be and we need to do a dfs traversal in whole graph
        vis[src] = true;
        System.out.print(src + " ");

        for (int neighbour : arrayList.get(src)) {
            if (!vis[neighbour]) {//vis neighbour = true upar ho jaayega apne aap
                dfs(neighbour, vis);
            }
        }

    }

    public static void bfs(int src, boolean vis[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        vis[src] = true;

        while (!queue.isEmpty()) {

            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int neighbour : arrayList.get(cur)) {
                if (!vis[neighbour]) {
                    queue.add(neighbour);
                    vis[neighbour] = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        int v = 4;//4vertices
        GraphList graph = new GraphList(v);
        graph.addEdge(0, 1);//0 to 1 an edge should be there
        graph.addEdge(2, 3);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);//it was a square......so in dfs it willgo in depth....0,1,2,3
//        whereas in bfs it will go in breath first...0,1,3,2
        boolean vis[] = new boolean[v];
        dfs(0, vis);
        System.out.println();
        boolean visi[] = new boolean[v];
        bfs(0, visi);

    }
}
