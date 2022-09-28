package graphs;

import java.util.ArrayList;

//in short if we found a visited vertex which is not parent of current vertex...cycle is present
public class DetectCycleInUndirectedGraph {
    ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    int v;

    public DetectCycleInUndirectedGraph(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());
        }
    }

    public boolean isCycle(int src, boolean vis[], int parent) {////we are running for loop because disconnected components can also be present so as to avoid that we are applying for loop
        for (int i = 0; i < v; i++) {//we are running for loop because disconnected components can also be present so as to avoid that we are applying for loop
            if (!vis[i]) {
                if (isCyclePresentDFS(i, vis, -1)) return true;//-1 will be neighbour for itself}
            }
        }
        return false;
    }

    public boolean isCyclePresentDFS(int src, boolean vis[], int parent) {
        vis[src] = true;
        for (int neighbor : a.get(src)) {//har ek vertex of arraylist...ki har ek list mein travel krenge
            if (!vis[neighbor]) {
                if (isCyclePresentDFS(neighbor, vis, v)) {// v will be new parent for it's neighbour
                    return true;
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        we will be using dfs in this


    }
}
