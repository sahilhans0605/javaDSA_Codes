package graphs;

import java.util.ArrayList;

public class FindTheMinimumDistanceFromSourceToDestination {
//shortest path hi hai!!!
    static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    static int v;

    public FindTheMinimumDistanceFromSourceToDestination(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());
        }
    }

    public static void dfs(int src, boolean vis[]) {
        vis[src] = true;
        System.out.print(src + " ");
        for (int neighbor : a.get(src)) {
            if (!vis[neighbor]) {
                dfs(neighbor, vis);
            }
        }
    }


    public static void main(String[] args) {
        int v = 8;
        FindTheMinimumDistanceFromSourceToDestination graph = new FindTheMinimumDistanceFromSourceToDestination(v);
        graph.addEdge(0, 1);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);

//        graph.addEdge(3, 6);
//        graph.addEdge(5, 7);
//        graph.addEdge(2, 7);

        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(4, 6);

//        dfs for every connected component
        int count=0;
        boolean vis[]= new boolean[v];
        for (int i = 0; i < v; i++) {
            if(!vis[i]){
                count++;//dfs0 krne se saare vertices mein travel nhi kr paate...sirf 0 waale se connected vertex tk hi jaa paate...par hume disconnected bhi chahiye they toh,...humne i lgake pure graph mein visit kiya
                dfs(i,vis);
            }
        }
        System.out.println();
        System.out.println(count);

    }

    private void addEdge(int src, int dest) {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
}
