package heapsAndPriorityQueue;

public class MainClass {
    public static void main(String[] args) throws Exception {
        MinHeap minHeap = new MinHeap(4);
        minHeap.insert(1);
        minHeap.insert(10);
        minHeap.printHeap();
        System.out.println();
//        System.out.print(minHeap.n);//size of minheap
        System.out.println();
        minHeap.insert(12);
        minHeap.insert(1);
        minHeap.printHeap();
        System.out.println();
        System.out.println(minHeap.extractMinOrDeletion());
        minHeap.printHeap();
    }
}
