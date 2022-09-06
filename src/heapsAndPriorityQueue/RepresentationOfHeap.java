package heapsAndPriorityQueue;

public class RepresentationOfHeap {
    public static void main(String[] args) {
//                      FOR 1 BASED INDEXING IN ARRAY
//        Nodes can be duplicate in a heap....and they are valid for complete binary tree only
//        if(Node ==i)-->parent=floor(i/2).............where i is the index of that node
//        left child=>2*i
//        right child=>2*i+1
//        How to check whether it hasleft or right child...
//        if(2*i)<=n
//        if(2*i+1)<=n

//        Insert ...time complexity O(log n).....why?-->
//        because firstly we insert1 then 2then 4.....this is why insertion takes...n/2^k...
//        Leaf nodes in heaps start from n/2 + 1 to n ....eg it comes 3 to 5..so leaf nodes will be 3,4,5
    }
}
