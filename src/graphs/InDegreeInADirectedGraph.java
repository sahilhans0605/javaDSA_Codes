package graphs;

import java.util.*;

public class InDegreeInADirectedGraph {

    static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    static int v;
    int indegree[];

    public InDegreeInADirectedGraph(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());
        }
        indegree = new int[v];
    }
//https://unacademy.com/class/graph-leetcode-problems/MHSIEOX6

    private void addEdge(int src, int dest) {
        a.get(src).add(dest);
//        a.get(dest).add(src);...this line will not be written here...as it is a directed graph only from source to destination
    }

    public static void dfs(int src, boolean[] vis, Stack<Integer> stack) { //src will be and we need to do a dfs traversal in whole graph
        vis[src] = true;
//        System.out.print(src + " ");

        for (int neighbour : a.get(src)) {
            if (!vis[neighbour]) {//vis neighbour = true upar ho jaayega apne aap
                dfs(neighbour, vis, stack);
            }
        }
        stack.push(src);
    }

    void topologicalSortUsingDFS() {
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(i, vis, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    void indegree() {
        for (ArrayList<Integer> adjacent : a) {
            for (int neighbour : adjacent) {
                indegree[neighbour]++;
            }
        }
    }

    void topologicalSortingUsingBFS() {
        indegree();
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
                count++;
            }
            while (!queue.isEmpty()) {
                int cur = queue.poll();
                arrayList.add(cur);
                System.out.print(cur + " ");
                for (int neighbor : a.get(cur)) {
                    indegree[neighbor]--;
                    if (indegree[neighbor] == 0) {
                        queue.add(neighbor);
                        count++;
                    }
                }
            }
        }
        if(count<v){
//            sout("Cycle is present")
        }else{
//            sout("Cycle is not present")
        }
    }


    public static void main(String[] args) {
//        indegree--->number of directions coming inside
//        in directed graphs we look at out going edges
//        int v = 4;
        int v = 6;
        InDegreeInADirectedGraph graph = new InDegreeInADirectedGraph(v);
//        graph.addEdge(0, 1);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 2);
//        graph.addEdge(0, 2);
//        graph.addEdge(2, 3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        graph.addEdge(3, 4);
        graph.addEdge(0, 2);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        graph.indegree();

        for (int e : graph.indegree) {
            System.out.print(e + " ");
        }
    }

}