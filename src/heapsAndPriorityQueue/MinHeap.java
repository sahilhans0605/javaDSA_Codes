package heapsAndPriorityQueue;

//TC is logn in both insertion and deletion
public class MinHeap {

    int capacity;
    int a[];
    int n;


    public MinHeap(int capacity) {
        this.capacity = capacity;
        n = 0;//till no elements in array
        a = new int[capacity + 1];//because we have taken 1 based indexing here...toh ek ek index age kiya isliye capacitybhi +1 krdiya

    }

    public MinHeap(int a[]) {
        this.a = a;
        this.capacity = a.length - 1;
        this.n = a.length - 1;
        buildHeap();
    }

    public void insert(int key) throws Exception {//TC logn as we insert by travelling whole height of tree
        if (n == capacity) throw new Exception("Heap is full");
        n++;
        a[n] = key;//first element a[1]=key
//        basically array mein hi daala element toh last mein dala...ab usko uski sahi position pe laana hai

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
       for(int i=1;i<=n;i++){
           System.out.println(a[i]+" ");
       }
    }

    private void swap(int parent, int i) {
        int temp = a[parent];
        a[parent] = a[i];
        a[i] = temp;
    }

    //    we always delete root element here...a[1]
    public int extractMinOrDeletion() throws Exception {
        if (n == 0) throw new Exception("Heap is Empty");
        int result = a[1];
        a[1] = a[n];//last element ko uthake le aate hai....root ki jgh fir shuffle krte h saare element ko
        n--;
        int i = 1;
//        Heapify
        while (i <= n) {
            int left = 2 * i;
            int right = 2 * i + 1;

            int smallest = i;//smallest ko parent maan ke chal rhe the

            if (a[left] < n && a[smallest] > a[left]) {
                smallest = left;
            }
            if (a[right] < n && a[right] < a[smallest]) {
                smallest = right;
            }
            if (smallest != i) {//when it reaches leaf node...means vo apni sahi jgh pe phuch gya hai break krdenge
                swap(smallest, i);
                i = smallest;
            } else {
                break;
            }
        }
        return result;
    }

    void heapify(int i) {
        while (i <= n) {
            int left = 2 * i;
            int right = 2 * i + 1;

            int smallest = i;//smallest ko parent maan ke chal rhe the

            if (a[left] < n && a[smallest] > a[left]) {
                smallest = left;
            }
            if (a[right] < n && a[right] < a[smallest]) {
                smallest = right;
            }
            if (smallest != i) {//when it reaches leaf node...means vo apni sahi jgh pe phuch gya hai break krdenge
                swap(smallest, i);
                i = smallest;
            } else {
                break;
            }
        }
    }

    void buildHeap() {
        for (int i = n; i > 0; i--) {
            heapify(i);//O(n)
        }
    }

    void heapSort() throws Exception {
//        array ke saare elements ko heapify kr kr ke ek heap bnaya....
//        ab heap bn gya toh uske ek ek element ko nikaalenge toh vo sorted order mein aayenge..because it is extracting minimum number from heap//heap ki property
        int newN=n;
        for (int i = 1; i <= newN; i++) {
            int x = extractMinOrDeletion();
            System.out.println(x+" ");
        }
    }

}
