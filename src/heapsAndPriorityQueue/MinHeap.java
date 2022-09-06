package heapsAndPriorityQueue;
//TC is logn in both insertion and deletion
public class MinHeap {

    int capacity;
    int a[];
    int n;


    public MinHeap(int capacity) {
        this.capacity = capacity;
        n = 0;//till no elements in array
        a = new int[capacity + 1];

    }

    public void insert(int key) throws Exception {
        if (n == capacity) throw new Exception("Heap is full");
        n++;
        a[n] = key;//first element a[1]=key

        int i = n;
        while (i > 1) {//i km hota jaayega parent = i/2 ho ho ke
            int parent = i / 2;
            if (a[parent] > a[i]) {
                swap(parent, i);
                i = parent;
            } else return;
        }
    }

    public void printHeap() {
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    private void swap(int parent, int i) {
        int temp = a[parent];
        a[parent] = a[i];
        a[i] = temp;
    }

    //    we will delete root element here...a[1]
    public int extractMinOrDeletion() throws Exception {
        if (n == 0) throw new Exception("Heap is Empty");
        int result = a[1];
        a[1] = a[n];
        n--;
        int i = 1;
//        Heapify
        while (i <= n) {
            int left = 2 * i;
            int right = 2 * i + 1;

            int smallest = i;//smallest ko parent maan ke chal rhe the

            if (a[left] < n && a[smallest] < a[left]) {
                smallest = left;
            }
            if (a[right] < n && a[right] < a[smallest]) {
                smallest = right;
            }
            if (smallest != i) {//when it reaches leaf node
                swap(smallest, i);
                i = smallest;
            } else {
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {

    }
}
