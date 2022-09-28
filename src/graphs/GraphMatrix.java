package graphs;

public class GraphMatrix {

    int a[][];
    int v;//vertex

    public GraphMatrix(int v) {
        this.v = v;
        a = new int[v][v];
    }

    public void addEdge(int src, int dest) {
        a[src][dest] = 1;//for undirected graph
        a[dest][src] = 1;//for undirected graph

    }

    public static void main(String[] args) {
        int v = 4;//4vertices
        int e = 10;

        GraphMatrix graph = new GraphMatrix(v);
        graph.addEdge(0, 1);//0 to 1 an edge should be there
        graph.addEdge(2, 3);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);
    }
}
