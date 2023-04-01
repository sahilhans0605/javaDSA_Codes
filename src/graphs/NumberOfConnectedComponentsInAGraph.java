package graphs;

import static graphs.GraphList.bfs;
import static graphs.GraphList.dfs;

public class NumberOfConnectedComponentsInAGraph {
    public static void main(String[]args){
//        FindTheMinimumDistanceFromSourceToDestination
//        //connected components' means connected parts....jo alag alag hai of graph
        int v = 7;//7vertices
        GraphList graph = new GraphList(v);
        graph.addEdge(0, 1);//0 to 1 an edge should be there
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);
        graph.addEdge(4, 5);//it was a square......so in dfs it willgo in depth....0,1,2,3
        graph.addEdge(5, 6);
        graph.addEdge(4, 6);
//        whereas in bfs it will go in breath first...0,1,3,2
        boolean vis[] = new boolean[v];
        dfs(0, vis);
        System.out.println();
        boolean visi[] = new boolean[v];
        bfs(0, visi);
        int count=0;
        numberOfCOnnectedComponents(v,count,visi);
    }

    private static void numberOfCOnnectedComponents(int v, int count,boolean vis[]) {
        System.out.println();
        for(int i=0;i<v;i++){
            if(!vis[i]){//whenever it is found that vis[i] is false...means components are not connected, and we found apart component
                dfs(i,vis);//then it will make true every connected component
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
