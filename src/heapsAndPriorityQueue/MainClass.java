package heapsAndPriorityQueue;

public class MainClass {
    public static void main(String[] args) throws Exception {
//        MinHeap minHeap = new MinHeap(4);
//        minHeap.insert(1);
//        minHeap.insert(10);
//        minHeap.printHeap();
//        System.out.println();
////        System.out.print(minHeap.n);//size of minheap
//        System.out.println();
//        minHeap.insert(12);
//        minHeap.insert(1);
//        minHeap.printHeap();
//        System.out.println();
//        System.out.println(minHeap.extractMinOrDeletion());
//        minHeap.printHeap();

        int a[] = {2, 9, 4, 7, 1, 6, 8};
        MinHeap minHeap1 = new MinHeap(a);
        minHeap1.printHeap();
//        minHeap1.heapSort();
    }
}
