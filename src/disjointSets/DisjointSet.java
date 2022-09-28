package disjointSets;

public class DisjointSet {
    int parent[];
    int rank[];

    //TC--->
    //    make elements from 0 to n-1
    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

//    Find the representative of the group

    int find(int x) {//we need to optimise the find function
//        if (x != parent[x]) {
//            return find(parent[x]);
//        }
        if (x != parent[x]) {//compression by path//O(m*small constant number...max 4.....linear time complexity for m operations)
            parent[x] = find(parent[x]);//parent[x] mein value updatekrdo...path har baar traverse nhi hona chahiye
        }
//        return x;
        return parent[x];//for path compression
    }

//    union into one group if they are not in a group already...make friends

    void union(int a, int b) {
        int captainA = find(a);
        int captainB = find(b);
        if (captainA == captainB) return;//both have same captains
        if (rank[captainA] < rank[captainB]) {//compression by rank
            parent[captainA] = captainB;
        } else if (rank[captainB] < rank[captainA]) {
            parent[captainB] = captainA;
        } else {//if both have same ranks
            parent[captainB] = captainA;
            rank[captainA]++;//jisko bhi parent bnaya uski rank ko ++krdiya
        }
    }

    //    Are in a team
    boolean isConnected(int a, int b) {
        int captainA = find(a);
        int captainB = find(b);
        return captainA == captainB;
    }
}
