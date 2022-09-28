package graphs;
//as it was directed and acyclic graph toh topological sort lgaya and O(V+E) mein output aagya
import java.util.ArrayList;

class Pair {
    int v;
    int wt;

    public Pair(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
}

public class ShortestDistanceINDAG {

    ArrayList<ArrayList<Pair>> a;
    int v;

    public ShortestDistanceINDAG() {
        this.v = v;
        a = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<Pair>());
        }
    }


    public static void main(String[] args) {

    }
}
